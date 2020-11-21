package com.example.oronaminse;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DrinkMenu extends AppCompatActivity {

    ImageButton back;
    Button logout, drinkbasket;
    Button numberleft = null;
    Button numberRight = null;
    RadioButton cola, sprite;
    RadioGroup DrinkGroup;
    TextView drinkamountnumber;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drinkmenu);

        numberleft = (Button) findViewById(R.id.DrinkAmountLeft);
        numberRight = (Button) findViewById(R.id.DrinkAmountRight);
        drinkamountnumber = (TextView)findViewById(R.id.DrinkAmountNumber);
        back = (ImageButton) findViewById(R.id.DrinkBack);
        logout = (Button) findViewById(R.id.DrinkLogout);
        drinkbasket = (Button) findViewById(R.id.DrinkBasket);
        numberleft = (Button) findViewById(R.id.DrinkAmountLeft);
        numberRight = (Button) findViewById(R.id.DrinkAmountRight);
        cola = (RadioButton) findViewById(R.id.DrinkCola);
        sprite = (RadioButton) findViewById(R.id.DrinkSprite);
        DrinkGroup = (RadioGroup) findViewById(R.id.DrinkRadio);

        findViewById(R.id.DrinkAmountLeft).setOnClickListener(clickListener);
        findViewById(R.id.DrinkAmountRight).setOnClickListener(clickListener);

        back.setOnClickListener(new View.OnClickListener() { // /* (뒤로가기) 스위트샵로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SweetShop.class);
                startActivity(intent);
            }
        }); // (뒤로가기) 스위트샵으로 이동 */

        logout.setOnClickListener(new View.OnClickListener() { // /* (로그아웃) 로그인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginScreen.class);
                startActivity(intent);
            }
        }); // (로그아웃) 로그인으로 이동 */

        drinkbasket.setOnClickListener(new View.OnClickListener() { // /* 스위트샵으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SweetShop.class);
                startActivity(intent);
            }
        }); // 스위트샵으로 이동 */

        DrinkGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.DrinkCola){ // 고소한 맛 라디오버튼 체크되었을 때
                    // 원하는 기능 구현
                }
                if(checkedId == R.id.DrinkSprite){ // 달콤한 맛 라디오버튼 체크되었을 때
                    // 원하는 기능 구현
                }
            }
        });
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            switch (v.getId()) {
                case R.id.DrinkAmountLeft:
                    count--;
                    drinkamountnumber.setText(""+count); // 수량 증가
                    break;
                case R.id.DrinkAmountRight:
                    count++;
                    drinkamountnumber.setText(""+count); // 수량 감소
                    break;
                default:
                    break;
            }
        }
    };


}
