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

import org.w3c.dom.Text;

public class Basket extends AppCompatActivity {

    ImageButton back;
    Button logout, payment;
    TextView basketPopcornNutty, basketPopcornSweet, basketDrinkCola, basketDrinkSprite;

    int nutty = ((PopcornMenu)PopcornMenu.context_nutty).popcornTasteNutty;
    int sweet = ((PopcornMenu)PopcornMenu.context_sweet).popcornTasteSweet;
    int cola = ((DrinkMenu)DrinkMenu.context_cola).drinkCola;
    int sprite = ((DrinkMenu)DrinkMenu.context_sprite).drinkSprite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basket);


        back = (ImageButton) findViewById(R.id.BasketBack);
        logout = (Button) findViewById(R.id.BasketLogout);
        payment = (Button) findViewById(R.id.BasketFinalPay);
        basketPopcornNutty = (TextView) findViewById(R.id.BasketPopcornNutty);
        basketPopcornSweet = (TextView) findViewById(R.id.BasketPopcornSweet);
        basketDrinkCola = (TextView) findViewById(R.id.BasketDrinkCola);
        basketDrinkSprite = (TextView) findViewById(R.id.BasketDrinkSprite);

        basketPopcornNutty.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(nutty>=1){
                    basketPopcornNutty.setText("고소한 맛 팝콘은" + nutty + "개 " + nutty*6000 + "원입니다.");
                }

            }
        });

        basketPopcornSweet.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (sweet >= 1) {
                    basketPopcornSweet.setText("달콤한 맛 " + sweet + "개 " + sweet*6500 + "원입니다.");
                }

            }
        });

        basketDrinkCola.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(cola>=1){
                    basketDrinkCola.setText("콜라는 " + cola + "개 " + cola*3000 + "원입니다.");
                }

            }
        });

        basketDrinkSprite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(sprite>=1){
                    basketDrinkSprite.setText("사이다는  " + sprite + "개 " + sprite*3000 + "원입니다.");
                }

            }
        });

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

        payment.setOnClickListener(new View.OnClickListener() { // /* 결제화면으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FinalPay.class);
                startActivity(intent);
            }
        }); // 결제화면으로 이동 */
    }
}
