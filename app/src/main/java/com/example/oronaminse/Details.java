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

public class Details extends AppCompatActivity {

    ImageButton back;
    Button logout, receipt;
    Button detailsnonmemberbtn;
    Dialog detailsnonmember;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);


        back = (ImageButton) findViewById(R.id.DetailsBack);
        logout = (Button) findViewById(R.id.DetailsLogout);
        receipt = (Button) findViewById(R.id.DetailsReceipt);
        detailsnonmemberbtn = (Button) findViewById(R.id.DetailsNonmemberBtn);


        detailsnonmember = new Dialog(Details.this);
        detailsnonmember.setContentView(R.layout.detailsnonmemberdialog);

        detailsnonmemberbtn.setOnClickListener(new View.OnClickListener() { // 비회원 조회를 클릭하면
            @Override
            public void onClick(View v) { showdetailsnonmember(); } // 비회원 조회 대화상자 출력
        });

        back.setOnClickListener(new View.OnClickListener() { // /* (뒤로가기) 메인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
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

        receipt.setOnClickListener(new View.OnClickListener() { // /* 영수증으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Receipt.class);
                startActivity(intent);
            }
        }); // 영수증으로 이동 */
    }

    public void showdetailsnonmember() { // 예매 불가능 대화상자
        detailsnonmember.show();

        Button DNOk = detailsnonmember.findViewById(R.id.DetailsNonmemberOk); // 확인버튼을 누르면
        DNOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                detailsnonmember.dismiss(); // 다이얼로그 닫기
            }
        });

        Button DNCn = detailsnonmember.findViewById(R.id.DetailsNonmemberCancel); // 확인버튼을 누르면
        DNCn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                detailsnonmember.dismiss(); // 다이얼로그 닫기
            }
        });
    }
}