package com.example.oronaminse;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ZootopiaTime extends AppCompatActivity {

    ImageButton back;
    Button logout,t0850,t1010,t1230;
    int check=0;
    int check0850=0;
    int check1010=0;
    int check1230=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zootopiatime);

        back = (ImageButton) findViewById(R.id.ZootopiatimeBack);
        logout = (Button) findViewById(R.id.ZootopiatimeLogout);
        t0850 = (Button) findViewById(R.id.Zoo0850);
        t1010 = (Button) findViewById(R.id.Zoo1010);
        t1230 = (Button) findViewById(R.id.Zoo1230);

        if(check0850==1) {
            Intent intent = new Intent(getApplicationContext(), TicketInformation.class);
            intent.putExtra("check0850", 1);
            startActivity(intent);
        }

        if(check1010==1) {
            Intent intent = new Intent(getApplicationContext(), TicketInformation.class);
            intent.putExtra("check1010", 1);
            startActivity(intent);
        }
        if(check1230==1) {
            Intent intent = new Intent(getApplicationContext(), TicketInformation.class);
            intent.putExtra("check1230", 1);
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

        t0850.setOnClickListener(new View.OnClickListener() { // /* 좌석선택화면으로 이동
            @Override
            public void onClick(View v) {
                check=1;
                check0850=1;
                Intent intent = new Intent (getApplicationContext(),ZootopiaSeat0850.class);
                startActivity(intent);


            }


        }); // 좌석선택화면으로 이동 */


        t1010.setOnClickListener(new View.OnClickListener() { // /* 좌석선택화면으로 이동
            @Override
            public void onClick(View v) {
                check=1;
                check1010=1;
                Intent intent = new Intent (getApplicationContext(),ZootopiaSeat1010.class);
                startActivity(intent);

            }
        }); // 좌석선택화면으로 이동 */


        t1230.setOnClickListener(new View.OnClickListener() { // /* 좌석선택화면으로 이동
            @Override
            public void onClick(View v) {
                check=1;
                check1230=1;
                Intent intent = new Intent (getApplicationContext(),ZootopiaSeat1230.class);
                startActivity(intent);
            }
        }); // 좌석선택화면으로 이동 */


    }
}