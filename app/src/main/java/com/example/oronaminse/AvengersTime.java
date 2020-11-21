package com.example.oronaminse;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AvengersTime extends AppCompatActivity {

    ImageButton back;
    Button logout,t1020,t1340,t1700;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avengerstime);

        back = (ImageButton) findViewById(R.id.AvengerstimeBack);
        logout = (Button) findViewById(R.id.AvengerstimeLogout);
        t1020 = (Button) findViewById(R.id.Ave1020);
        t1340 = (Button) findViewById(R.id.Ave1340);
        t1700 = (Button) findViewById(R.id.Ave1700);


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

        t1020.setOnClickListener(new View.OnClickListener() { // /* 좌석선택화면으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),AvengersSeat1020.class);
                startActivity(intent);
            }
        }); // 좌석선택화면으로 이동 */

        t1340.setOnClickListener(new View.OnClickListener() { // /* 좌석선택화면으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),AvengersSeat1340.class);
                startActivity(intent);
            }
        }); // 좌석선택화면으로 이동 */

        t1700.setOnClickListener(new View.OnClickListener() { // /* 좌석선택화면으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),AvengersSeat1700.class);
                startActivity(intent);
            }
        }); // 좌석선택화면으로 이동 */
    }
}