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

public class Receipt extends AppCompatActivity {

    ImageButton back;
    Button logout, receiptcancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receipt);


        back = (ImageButton) findViewById(R.id.ReceiptBack);
        logout = (Button) findViewById(R.id.ReceiptLogout);
        receiptcancel = (Button) findViewById(R.id.ReceiptCancel);

        back.setOnClickListener(new View.OnClickListener() { // /* (뒤로가기) 결제화면으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FinalPay.class);
                startActivity(intent);
            }
        }); // (뒤로가기) 결제화면으로 이동 */

        logout.setOnClickListener(new View.OnClickListener() { // /* (로그아웃) 로그인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginScreen.class);
                startActivity(intent);
            }
        }); // (로그아웃) 로그인으로 이동 */

        receiptcancel.setOnClickListener(new View.OnClickListener() { // /* (결제취소) 메인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        }); // (결제취소) 메인으로 이동 */
    }
}