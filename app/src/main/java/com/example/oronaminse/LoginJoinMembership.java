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



public class LoginJoinMembership extends AppCompatActivity {

    Button joinmembership, joinmembershipCancel;

    private FirebaseAuth mAuth;
    private FirebaseDatabase mDatabase;

    EditText email_join;
    EditText pwd_join;
    EditText birth_join;
    EditText name_join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginjoinmembershipdialog);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance();

        joinmembership = (Button) findViewById(R.id.JoinMembership);
        joinmembershipCancel = (Button) findViewById(R.id.JoinMembershipCancel);

        email_join = (EditText) findViewById(R.id.Email_Join);
        pwd_join = (EditText) findViewById(R.id.Pwd_Join);
        birth_join = (EditText) findViewById(R.id.Age_Join);
        name_join = (EditText) findViewById(R.id.Name_Join);

        joinmembership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });

        joinmembershipCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginScreen.class);
                startActivity(intent);
            }
        });
    }

    public class Userinfo{
        public String userEmail;
        public String userPassword;
        public String userName;
        public String userBirth;
        public String uid;

    }

        private void signup () {
            String user_email = email_join.getText().toString();
            String user_password = pwd_join.getText().toString();
            String user_name = name_join.getText().toString();
            String user_birth = birth_join.getText().toString();

            if (TextUtils.isEmpty(user_email) || TextUtils.isEmpty(user_password) ||
                    TextUtils.isEmpty(user_name) || TextUtils.isEmpty(user_birth)) {
                Toast.makeText(LoginJoinMembership.this, "정보를 바르게 입력해주세요",Toast.LENGTH_LONG).show();
                return;
            }

            else {
                mAuth.createUserWithEmailAndPassword(user_email, user_password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            final String uid = task.getResult().getUser().getUid();

                            Userinfo Userinfo = new Userinfo();

                            Userinfo.userEmail = user_email;
                            Userinfo.userPassword = user_password;
                            Userinfo.userName = user_name;
                            Userinfo.userBirth = user_birth;
                            Userinfo.uid = uid;


                            mDatabase.getReference().child("Users").child(uid).setValue(Userinfo);

                            Toast.makeText(LoginJoinMembership.this, "회원가입 성공", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), LoginScreen.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(LoginJoinMembership.this, "잘못된 계정이거나 이미 존재하는 계정입니다.", Toast.LENGTH_SHORT).show();

                        }
                    }
                });
            }
        }
    }
