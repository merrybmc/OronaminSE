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

public class Basket extends AppCompatActivity {

    ImageButton back;
    Button logout, payment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basket);


        back = (ImageButton) findViewById(R.id.BasketBack);
        logout = (Button) findViewById(R.id.BasketLogout);
        payment = (Button) findViewById(R.id.BasketFinalPay);


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
