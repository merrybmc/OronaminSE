package com.example.oronaminse;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LoginScreen extends AppCompatActivity {

    Button login,joinmember,nonlogin;
    Dialog joinmembershipdialog;
    Dialog nonmemberlogindialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginscreenlayout);

        login = (Button)findViewById(R.id.Login);

        joinmember = (Button) findViewById(R.id.JoinMeber);
        joinmembershipdialog = new Dialog(LoginScreen.this);
        joinmembershipdialog.setContentView(R.layout.loginjoinmembershipdialog);

        nonlogin = (Button) findViewById(R.id.NonLogin);
        nonmemberlogindialog = new Dialog(LoginScreen.this);
        nonmemberlogindialog.setContentView(R.layout.loginonmemberdialog);

        login.setOnClickListener(new View.OnClickListener() { // /* (로그인) 메인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        }); // (로그인) 메인으로 이동 */



        joinmember.setOnClickListener(new View.OnClickListener() { // 회원가입을 클릭하면
            @Override
            public void onClick(View v) { showjoinmemberDialog();
            }
        }); // 회원가입 대화상자 출력

        nonlogin.setOnClickListener(new View.OnClickListener() { // 비회원 로그인을 클릭하면
            @Override
            public void onClick(View v) { shownonmemberloginDialog();
            }
        }); // 비회원로그인 대화상자 출력
    }






    public void showjoinmemberDialog() { // 회원가입 대화상자
        joinmembershipdialog.show();

        Button JoinMembership = joinmembershipdialog.findViewById(R.id.JoinMembership); // 가입버튼을 누르면
        JoinMembership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //원하는 기능 구현
                //원하는 기능 구현
                joinmembershipdialog.dismiss(); // 다이얼로그 닫기
            }
        });

        Button JoinMembershipCancel = joinmembershipdialog.findViewById(R.id.JoinMembershipCancel); // 취소버튼을 누르면
        JoinMembershipCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                joinmembershipdialog.dismiss(); // 다이얼로그 닫기
            }
        });
    }

    public void shownonmemberloginDialog() { // 비회원로그인 대화상자
        nonmemberlogindialog.show();

        Button nonmemberlogin = nonmemberlogindialog.findViewById(R.id.NonMemberLogin); // 가입버튼을 누르면
        nonmemberlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nonmemberlogindialog.dismiss();
                Intent intent = new Intent (getApplicationContext(),MainActivity.class);

                //원하는 기능 구현
                //원하는 기능 구현

                startActivity(intent);// 다이얼로그 닫기
            }
        });

        Button nonmemberlogincancel = nonmemberlogindialog.findViewById(R.id.NonMemberLoginCancel); // 취소버튼을 누르면
        nonmemberlogincancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nonmemberlogindialog.dismiss(); // 다이얼로그 닫기
            }
        });


    }
}