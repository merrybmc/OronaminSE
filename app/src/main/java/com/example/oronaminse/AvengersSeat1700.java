package com.example.oronaminse;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AvengersSeat1700 extends AppCompatActivity {

    ImageButton back;
    Button logout,choice,A01,A02,A03,A04,A05,A06;

    boolean A1 = false;
    boolean A2 = false;
    boolean A3 = false;
    boolean A4 = false;
    boolean A5 = false;
    boolean A6 = false;
    int movie =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avengersseat1700);

        back = (ImageButton) findViewById(R.id.AvengersSeat1700Back);
        logout = (Button) findViewById(R.id.AvengersSeat1700Logout);
        choice = (Button) findViewById(R.id.ave1700choice);
        A01 = (Button) findViewById(R.id.ave1700a01);
        A02 = (Button) findViewById(R.id.ave1700a02);
        A03 = (Button) findViewById(R.id.ave1700a03);
        A04 = (Button) findViewById(R.id.ave1700a04);
        A05 = (Button) findViewById(R.id.ave1700a05);
        A06 = (Button) findViewById(R.id.ave1700a06);


        back.setOnClickListener(new View.OnClickListener() { // /* 어벤져스 시간목록으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),AvengersTime.class);
                startActivity(intent);
            }
        }); // 어벤져스 시간목록으로 이동 */

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
                intent.putExtra("check1700", 1);
                if(A1==true) {
                    intent.putExtra("A1", true);
                }
                if(A2==true) {
                    intent.putExtra("A2", true);
                }
                if(A3==true) {
                    intent.putExtra("A3", true);
                }
                if(A4==true) {
                    intent.putExtra("A4", true);
                }
                if(A5==true) {
                    intent.putExtra("A5", true);
                }
                if(A6==true) {
                    intent.putExtra("A6", true);
                }
                intent.putExtra("movie", 2);
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
                A1=true;
                A2=false;
                A3=false;
                A4=false;
                A5=false;
                A6=false;
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
                A1=false;
                A2=true;
                A3=false;
                A4=false;
                A5=false;
                A6=false;
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
                A1=false;
                A2=false;
                A3=true;
                A4=false;
                A5=false;
                A6=false;
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
                A1=false;
                A2=false;
                A3=false;
                A4=true;
                A5=false;
                A6=false;
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
                A1=false;
                A2=false;
                A3=false;
                A4=false;
                A5=true;
                A6=false;
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
                A1=false;
                A2=false;
                A3=false;
                A4=false;
                A5=false;
                A6=true;
            }
        });
    }
}