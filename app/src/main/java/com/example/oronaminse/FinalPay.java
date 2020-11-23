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

public class FinalPay extends AppCompatActivity {

    ImageButton back;
    Button logout, paycouponuse, paymileageuse, payfinal;

    int nutty = ((PopcornMenu)PopcornMenu.context_nutty).popcornTasteNutty;
    int sweet = ((PopcornMenu)PopcornMenu.context_sweet).popcornTasteSweet;
    int cola = ((DrinkMenu)DrinkMenu.context_cola).drinkCola;
    int sprite = ((DrinkMenu)DrinkMenu.context_sprite).drinkSprite;
    int finalPayment = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalpay);


        back = (ImageButton) findViewById(R.id.PayBack);
        logout = (Button) findViewById(R.id.PayLogout);
        payfinal = (Button) findViewById(R.id.PayFinal);
        paycouponuse = (Button) findViewById(R.id.PayCouponUse);
        paymileageuse = (Button) findViewById(R.id.PayMileageUse);

       finalPayment = nutty*6000 + sweet*6500 + cola*3000 + sprite*3000;

        back.setOnClickListener(new View.OnClickListener() { // /* (뒤로가기) 메인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        }); // (뒤로가기) 메인으로 이동 */

        logout.setOnClickListener(new View.OnClickListener() { // /* (로그아웃) 로그인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginScreen.class);
                startActivity(intent);
            }
        }); // (로그아웃) 로그인으로 이동 */

        payfinal.setOnClickListener(new View.OnClickListener() { // /* 영수증으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Receipt.class);
                startActivity(intent);
            }
        }); // 영수증으로 이동 */
    }
}