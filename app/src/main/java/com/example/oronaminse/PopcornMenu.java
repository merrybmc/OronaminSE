package com.example.oronaminse;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PopcornMenu extends AppCompatActivity {

    ImageButton back;
    Button logout, popcornbasket;
    Button numberleft = null;
    Button numberRight = null;
    RadioButton nutty, sweet;
    RadioGroup PopcornGroup;
    TextView popcornamountnumber;
    int count = 0;

    public static Context context_nutty;
    public static Context context_sweet;
    public int popcornTasteNutty = 0;
    public int popcornTasteSweet = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popcornmenu);

        numberleft = (Button) findViewById(R.id.PopcornAmountLeft);
        numberRight = (Button) findViewById(R.id.PopcornAmountRight);
        popcornamountnumber = (TextView)findViewById(R.id.PopcornAmountNumber);
        back = (ImageButton) findViewById(R.id.PopcornBack);
        logout = (Button) findViewById(R.id.PopcornLogout);
        popcornbasket = (Button) findViewById(R.id.PopcornBasket);
        numberleft = (Button) findViewById(R.id.PopcornAmountLeft);
        numberRight = (Button) findViewById(R.id.PopcornAmountRight);
        nutty = (RadioButton) findViewById(R.id.PopcornNutty);
        sweet = (RadioButton) findViewById(R.id.PopcornSweet);
        PopcornGroup = (RadioGroup) findViewById(R.id.PopcornRadio);

        findViewById(R.id.PopcornAmountLeft).setOnClickListener(clickListener);
        findViewById(R.id.PopcornAmountRight).setOnClickListener(clickListener);

        context_nutty = this;
        context_sweet = this;


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

        popcornbasket.setOnClickListener(new View.OnClickListener() { // /* 스위트샵으로 이동
            @Override
            public void onClick(View v){
                PopcornGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedID){
                        if(checkedID == R.id.PopcornNutty){ // 고소한 맛 라디오버튼 체크되었을 때
                            // 원하는 기능 구현
                            popcornTasteNutty += Integer.parseInt(popcornamountnumber.getText().toString());
                        }
                        if(checkedID == R.id.PopcornSweet){ // 달콤한 맛 라디오버튼 체크되었을 때
                            // 원하는 기능 구현
                            popcornTasteSweet += Integer.parseInt(popcornamountnumber.getText().toString());
                        }
                    }
                });
                Intent intent = new Intent(getApplicationContext(), SweetShop.class);
                startActivity(intent);
            }
        }); // 스위트샵으로 이동 */
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            switch (v.getId()) {
                case R.id.PopcornAmountLeft:
                    count--;
                    popcornamountnumber.setText(""+count); // 수량 증가
                    break;
                case R.id.PopcornAmountRight:
                    count++;
                    popcornamountnumber.setText(""+count); // 수량 감소
                    break;
                default:
                    break;
            }
        }
    };


}
