package com.example.oronaminse;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.oronaminse.FinalPay;
import com.example.oronaminse.LoginScreen;
import com.example.oronaminse.MovieList;
import com.example.oronaminse.R;
import com.example.oronaminse.SweetShop;

public class TicketInformation extends AppCompatActivity {

    ImageButton back;
    Button logout, pay, sweet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticketinformation);

        back = (ImageButton) findViewById(R.id.TicketInfoBack);
        logout = (Button) findViewById(R.id.TicketInfoBackLogout);
        sweet = (Button) findViewById(R.id.TicketInfoSweet);
        pay = (Button) findViewById(R.id.TicketInfoPay);

        back.setOnClickListener(new View.OnClickListener() { // /* (뒤로가기) 영화목록으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MovieList.class);
                startActivity(intent);
            }
        }); // (뒤로가기) 영화목록으로 이동 */

        logout.setOnClickListener(new View.OnClickListener() { // /* (로그아웃) 로그인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginScreen.class);
                startActivity(intent);
            }
        }); // (로그아웃) 로그인으로 이동 */

        sweet.setOnClickListener(new View.OnClickListener() { // /* (스위트샵메뉴) 스위트샵으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SweetShop.class);
                startActivity(intent);
            }
        }); // (선택) 스위트샵으로 이동 */

        pay.setOnClickListener(new View.OnClickListener() { // /* (스위트샵메뉴) 스위트샵으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FinalPay.class);
                startActivity(intent);
            }
        }); // (선택) 스위트샵으로 이동 */
    }
}