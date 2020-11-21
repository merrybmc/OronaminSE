package com.example.oronaminse;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SweetShop extends AppCompatActivity {

    ImageButton back, popcornmenu, drinkmenu, basket;
    Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sweetshop);

        back = (ImageButton) findViewById(R.id.SweetshopBack);
        popcornmenu = (ImageButton) findViewById(R.id.PopcornMenu);
        drinkmenu = (ImageButton) findViewById(R.id.DrinkMenu);
        basket = (ImageButton) findViewById(R.id.Basket);
        logout = (Button) findViewById(R.id.SweetshopLogout);


        back.setOnClickListener(new View.OnClickListener() { // /* (뒤로가기) 메인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        }); // (뒤로가기) 예매정보으로 이동 */

        logout.setOnClickListener(new View.OnClickListener() { // /* (로그아웃) 로그인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),LoginScreen.class);
                startActivity(intent);
            }
        }); // (로그아웃) 로그인으로 이동 */

        popcornmenu.setOnClickListener(new View.OnClickListener() { // /* (선택) 예매정보화면으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), PopcornMenu.class);
                startActivity(intent);
            }
        }); // (선택) 예매정보화면으로 이동 */

       drinkmenu.setOnClickListener(new View.OnClickListener() { // /* 음료메뉴 화면으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),DrinkMenu.class);
                startActivity(intent);
            }
        }); // 음료메뉴 화면으로 이동 */

        basket.setOnClickListener(new View.OnClickListener() { // /* 장바구니로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),Basket.class);
                startActivity(intent);
            }
        }); // 장바구니로 이동 */
    }
}