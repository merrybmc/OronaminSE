package com.example.oronaminse;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.oronaminse.FinalPay;
import com.example.oronaminse.LoginScreen;
import com.example.oronaminse.MovieList;
import com.example.oronaminse.R;
import com.example.oronaminse.SweetShop;

public class TicketInformation extends AppCompatActivity {

    ImageView Ticket_InfoImg,Ticket_InfoImg4;
    TextView Ticket_InfoText, Ticket_InfoTime,Ticket_InfoSeat,Ticket_InfoMoney;
    ImageButton back;
    Button logout, pay, sweet;

    String title1=" 어벤져스 : 앤드게임";
    String title2=" 주토피아";
    String title3=" 신세계";

    String time1="0850";
    String time2="1010";
    String time3="1230";

    String price1="10000";
    String price2="10000";
    String price3="10000";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticketinformation);

        Ticket_InfoImg=(ImageView) findViewById(R.id.TicketInfoImg);
        Ticket_InfoImg4=(ImageView) findViewById(R.id.TicketInfoImg4);

        Ticket_InfoText = (TextView) findViewById(R.id.TicketInfoText);
        Ticket_InfoTime = (TextView) findViewById(R.id.TicketInfoTime);
        Ticket_InfoSeat = (TextView) findViewById(R.id.TicketInfoSeat);
        Ticket_InfoMoney = (TextView) findViewById(R.id.TicketInfoMoney);

        Intent intent = getIntent();
        int check0850 = intent.getExtras().getInt("check0850");
        int check1010 = intent.getExtras().getInt("check1010");
        int check1230 = intent.getExtras().getInt("check1230");
        int movie = intent.getExtras().getInt("movie");

        int check1020 = intent.getExtras().getInt("check1020");
        int check1340 = intent.getExtras().getInt("check1340");
        int check1700 = intent.getExtras().getInt("check1700");

        int check1250 = intent.getExtras().getInt("check1250");
        int check1520 = intent.getExtras().getInt("check1520");
        int check1750 = intent.getExtras().getInt("check1750");

        // 주토피아 좌석
        boolean A1 = intent.getExtras().getBoolean("A1");
        boolean A2 = intent.getExtras().getBoolean("A2");
        boolean A3 = intent.getExtras().getBoolean("A3");
        boolean A4 = intent.getExtras().getBoolean("A4");
        boolean A5 = intent.getExtras().getBoolean("A5");
        boolean A6 = intent.getExtras().getBoolean("A6");
//        //어벤저스 좌석
//        boolean B1 = intent.getExtras().getBoolean("B1");
//        boolean B2 = intent.getExtras().getBoolean("B2");
//        boolean B3 = intent.getExtras().getBoolean("B3");
//        boolean B4 = intent.getExtras().getBoolean("B4");
//        boolean B5 = intent.getExtras().getBoolean("B5");
//        boolean B6 = intent.getExtras().getBoolean("B6");
        if(movie==1) {
            Ticket_InfoImg.setImageResource(R.drawable.zootopia);// 영화사진
            Ticket_InfoText.setText(Ticket_InfoText.getText()+title2); // 제목
            Ticket_InfoImg4.setImageResource(R.drawable.all);
            Ticket_InfoMoney.setText(Ticket_InfoMoney.getText()+price2);
        }
        if(movie==2) {
            Ticket_InfoImg.setImageResource(R.drawable.avengers); // 영화사진
            Ticket_InfoText.setText(Ticket_InfoText.getText()+title1); // 제목
            Ticket_InfoImg4.setImageResource(R.drawable.twelve);
            Ticket_InfoMoney.setText(Ticket_InfoMoney.getText()+price1);
        }
        if(movie==3) {
            Ticket_InfoImg.setImageResource(R.drawable.worldnew); // 영화사진
            Ticket_InfoText.setText(Ticket_InfoText.getText()+title3); // 제목
            Ticket_InfoImg4.setImageResource(R.drawable.nineteen);
            Ticket_InfoMoney.setText(Ticket_InfoMoney.getText()+price3);
        }

        // 주토피아 시간 SET
        if(check0850==1) {
            Ticket_InfoTime.setText(Ticket_InfoTime.getText() + "08:50");
        }
        if(check1010==1) {
            Ticket_InfoTime.setText(Ticket_InfoTime.getText() + "10:10");
        }
        if(check1230==1) {
            Ticket_InfoTime.setText(Ticket_InfoTime.getText() + "12:30");
        }

        // 어벤저스 시간 SET
        if(check1020==1) {
            Ticket_InfoTime.setText(Ticket_InfoTime.getText() + "10:20");
        }
        if(check1340==1) {
            Ticket_InfoTime.setText(Ticket_InfoTime.getText() + "13:40");
        }
        if(check1700==1) {
            Ticket_InfoTime.setText(Ticket_InfoTime.getText() + "17:00");
        }

        // 신세계 시간 SET
        if(check1250==1) {
            Ticket_InfoTime.setText(Ticket_InfoTime.getText() + "12:50");
        }
        if(check1520==1) {
            Ticket_InfoTime.setText(Ticket_InfoTime.getText() + "15:20");
        }
        if(check1750==1) {
            Ticket_InfoTime.setText(Ticket_InfoTime.getText() + "17:50");
        }
        
        // 좌석 SET
        if(A1==true) {
            Ticket_InfoSeat.setText(Ticket_InfoSeat.getText() + "A1");
        }
        if(A2==true) {
            Ticket_InfoSeat.setText(Ticket_InfoSeat.getText() + "A2");
        }
        if(A3==true) {
            Ticket_InfoSeat.setText(Ticket_InfoSeat.getText() + "A3");
        }
        if(A4==true) {
            Ticket_InfoSeat.setText(Ticket_InfoSeat.getText() + "A4");
        }
        if(A5==true) {
            Ticket_InfoSeat.setText(Ticket_InfoSeat.getText() + "A5");
        }
        if(A6==true) {
            Ticket_InfoSeat.setText(Ticket_InfoSeat.getText() + "A6");
        }





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

        pay.setOnClickListener(new View.OnClickListener() { // /* (결제메뉴) 결제하기
            @Override
            //intent.putExtra("check1020", 1);
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FinalPay.class);
                if(movie==1) {
                    intent.putExtra("title2", " 주토피아");
                    intent.putExtra("price2", 10000);

                    if(check0850==1) {
                        intent.putExtra("t0850", "08:50");
                    }
                    if(check1010==1) {
                        intent.putExtra("t1010", "10:10");
                    }
                    if(check1230==1) {
                        intent.putExtra("t1230", "12:30");
                    }
                }

                if(movie==2) {
                    intent.putExtra("title1", " 어벤져스 : 앤드게임");
                    intent.putExtra("price1", 10000);
                    if (check1020 == 1) {
                        intent.putExtra("t1020", "10:20");
                    }
                    if (check1340 == 1) {
                        intent.putExtra("t1340", "13:40");
                    }
                    if (check1700 == 1) {
                        intent.putExtra("t1700", "17:00");
                    }
                }

                if(movie==3) {
                    intent.putExtra("title3",  " 신세계");
                    intent.putExtra("price3", 10000);
                    if(check1250==1) {
                        intent.putExtra("t1250", "12:50");
                    }
                    if(check1520==1) {
                        intent.putExtra("t1520", "15:20");
                    }
                    if(check1750==1) {
                        intent.putExtra("t1750", "17:50");
                    }
                }

                if(A1==true) {
                    intent.putExtra("A1",  " A열 1번");
                }
                if(A2==true) {
                    intent.putExtra("A1",  " A열 2번");
                }
                if(A3==true) {
                    intent.putExtra("A1",  " A열 3번");
                }
                if(A4==true) {
                    intent.putExtra("A1",  " A열 4번");
                }
                if(A5==true) {
                    intent.putExtra("A1",  " A열 5번");
                }
                if(A6==true) {
                    intent.putExtra("A1",  " A열 6번");
                }

                startActivity(intent);
            }
        }); // (선택) 스위트샵으로 이동 */
    }
}