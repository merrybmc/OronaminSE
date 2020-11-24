package com.example.oronaminse;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;



public class LoginJoinNonMembership extends AppCompatActivity {

    Button nonjoinmembership, nonjoinmembershipCancel;

    private FirebaseDatabase mDatabase;

    EditText non_name_join;
    EditText non_pwd_join;
    EditText non_birth_join;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginonmemberdialog);

        mDatabase = FirebaseDatabase.getInstance();

        nonjoinmembership = (Button) findViewById(R.id.JoinNonMembership);
        nonjoinmembershipCancel = (Button) findViewById(R.id.JoinNonMembershipCancel);

        non_name_join = (EditText) findViewById(R.id.Non_JoinName);
        non_pwd_join = (EditText) findViewById(R.id.Non_JoinPw);
        non_birth_join = (EditText) findViewById(R.id.Non_JoinBirth);

        nonjoinmembership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nonsignup();
            }
        });

        nonjoinmembershipCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginScreen.class);
                startActivity(intent);
            }
        });
    }

    public class NonUserinfo {
        public String NonuserName;
        public String NonuserPassword;
        public String NonuserBirth;

    }

    private void nonsignup () {
        String non_user_name = non_name_join.getText().toString();
        String non_user_password = non_pwd_join.getText().toString();
        String non_user_birth = non_birth_join.getText().toString();

        if (TextUtils.isEmpty(non_user_name) || TextUtils.isEmpty(non_user_password) ||
                TextUtils.isEmpty(non_user_birth)) {
            Toast.makeText(LoginJoinNonMembership.this, "정보를 바르게 입력해주세요",Toast.LENGTH_LONG).show();
            return;
        }

        else {

            NonUserinfo NonUserinfo = new NonUserinfo();

            NonUserinfo.NonuserName = non_user_name;
            NonUserinfo.NonuserPassword = non_user_password;
            NonUserinfo.NonuserBirth = non_user_birth;

            mDatabase.getReference().child("NonUsers").setValue(NonUserinfo);

            Toast.makeText(LoginJoinNonMembership.this, "비회원가입 성공", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
                }
            }
        }
