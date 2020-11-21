package com.example.oronaminse;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class WorldnewSeat1750 extends AppCompatActivity {

    ImageButton back;
    Button logout,choice,A01,A02,A03,A04,A05,A06;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worldnewseat1750);

        back = (ImageButton) findViewById(R.id.WorldnewSeat1750Back);
        logout = (Button) findViewById(R.id.WorldnewSeat1750Logout);
        choice = (Button) findViewById(R.id.wor1750choice);
        A01 = (Button) findViewById(R.id.wor1750a01);
        A02 = (Button) findViewById(R.id.wor1750a02);
        A03 = (Button) findViewById(R.id.wor1750a03);
        A04 = (Button) findViewById(R.id.wor1750a04);
        A05 = (Button) findViewById(R.id.wor1750a05);
        A06 = (Button) findViewById(R.id.wor1750a06);


        back.setOnClickListener(new View.OnClickListener() { // /* 신세계 시간목록으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),WorldnewTime.class);
                startActivity(intent);
            }
        }); // 신세계 시간목록으로 이동 */

        logout.setOnClickListener(new View.OnClickListener() { // /* (로그아웃) 로그인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),LoginScreen.class);
                startActivity(intent);
            }
        }); // (로그아웃) 로그인으로 이동 */

        choice.setOnClickListener(new View.OnClickListener() { // /* (선택) 예매정보화면으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),TicketInformation.class);
                startActivity(intent);
            }
        }); // (선택) 예매정보화면으로 이동 */

        A01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A01.setBackgroundResource(R.color.red);
                A02.setBackgroundResource(R.color.seatnormal);
                A03.setBackgroundResource(R.color.seatnormal);
                A04.setBackgroundResource(R.color.seatnormal);
                A05.setBackgroundResource(R.color.seatnormal);
                A06.setBackgroundResource(R.color.seatnormal);
            }
        });

        A02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A02.setBackgroundResource(R.color.red);
                A01.setBackgroundResource(R.color.seatnormal);
                A03.setBackgroundResource(R.color.seatnormal);
                A04.setBackgroundResource(R.color.seatnormal);
                A05.setBackgroundResource(R.color.seatnormal);
                A06.setBackgroundResource(R.color.seatnormal);
            }
        });

        A03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A03.setBackgroundResource(R.color.red);
                A02.setBackgroundResource(R.color.seatnormal);
                A01.setBackgroundResource(R.color.seatnormal);
                A04.setBackgroundResource(R.color.seatnormal);
                A05.setBackgroundResource(R.color.seatnormal);
                A06.setBackgroundResource(R.color.seatnormal);
            }
        });

        A04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A04.setBackgroundResource(R.color.red);
                A02.setBackgroundResource(R.color.seatnormal);
                A03.setBackgroundResource(R.color.seatnormal);
                A01.setBackgroundResource(R.color.seatnormal);
                A05.setBackgroundResource(R.color.seatnormal);
                A06.setBackgroundResource(R.color.seatnormal);
            }
        });

        A05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A05.setBackgroundResource(R.color.red);
                A02.setBackgroundResource(R.color.seatnormal);
                A03.setBackgroundResource(R.color.seatnormal);
                A04.setBackgroundResource(R.color.seatnormal);
                A01.setBackgroundResource(R.color.seatnormal);
                A06.setBackgroundResource(R.color.seatnormal);
            }
        });

        A06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A06.setBackgroundResource(R.color.red);
                A02.setBackgroundResource(R.color.seatnormal);
                A03.setBackgroundResource(R.color.seatnormal);
                A04.setBackgroundResource(R.color.seatnormal);
                A05.setBackgroundResource(R.color.seatnormal);
                A01.setBackgroundResource(R.color.seatnormal);
            }
        });
    }
}