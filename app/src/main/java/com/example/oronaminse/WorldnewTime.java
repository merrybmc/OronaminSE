package com.example.oronaminse;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class WorldnewTime extends AppCompatActivity {

    ImageButton back;
    Button logout,t1250,t1520,t1750;
    int check1250=0;
    int check1520=0;
    int check1750=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worldnewtime);

        back = (ImageButton) findViewById(R.id.WorldnewtimeBack);
        logout = (Button) findViewById(R.id.WorldnewtimeLogout);
        t1250 = (Button) findViewById(R.id.Wor1250);
        t1520 = (Button) findViewById(R.id.Wor1520);
        t1750 = (Button) findViewById(R.id.Wor1750);

        if(check1250==1) {
            check1250=1;
            Intent intent = new Intent(getApplicationContext(), TicketInformation.class);
            intent.putExtra("check1250", 1);
            startActivity(intent);
        }

        if(check1520==1) {
            check1520=1;
            Intent intent = new Intent(getApplicationContext(), TicketInformation.class);
            intent.putExtra("check1340", 1);
            startActivity(intent);
        }
        if(check1750==1) {
            check1750=1;
            Intent intent = new Intent(getApplicationContext(), TicketInformation.class);
            intent.putExtra("check1700", 1);
            startActivity(intent);
        }

        back.setOnClickListener(new View.OnClickListener() { // /* (뒤로가기) 영화목록으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),MovieList.class);
                startActivity(intent);
            }
        }); // (뒤로가기) 영화목록으로 이동 */

        logout.setOnClickListener(new View.OnClickListener() { // /* (로그아웃) 로그인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),LoginScreen.class);
                startActivity(intent);
            }
        }); // (로그아웃) 로그인으로 이동 */

        t1250.setOnClickListener(new View.OnClickListener() { // /* 좌석선택화면으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),WorldnewSeat1250.class);
                startActivity(intent);
            }
        }); // 좌석선택화면으로 이동 */

        t1520.setOnClickListener(new View.OnClickListener() { // /* 좌석선택화면으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),WorldnewSeat1520.class);
                startActivity(intent);
            }
        }); // 좌석선택화면으로 이동 */

        t1750.setOnClickListener(new View.OnClickListener() { // /* 좌석선택화면으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),WorldnewSeat1750.class);
                startActivity(intent);
            }
        }); // 좌석선택화면으로 이동 */
    }
}