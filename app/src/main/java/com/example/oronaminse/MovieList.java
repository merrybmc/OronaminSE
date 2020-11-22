package com.example.oronaminse;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

public class MovieList extends AppCompatActivity {

    Button genrepopup,movielistlogout,scoresort,ratiosort,agesort;
    ImageButton back,movieticketing1,movieticketing2,movieticketing3;
    Dialog unsatisfactory;
    Dialog nonmember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movielistlayout);

        genrepopup = (Button) findViewById(R.id.GenreSort);
        movielistlogout = (Button) findViewById(R.id.MovieListLogout);

        scoresort = (Button) findViewById(R.id.ScoreSort);
        ratiosort = (Button) findViewById(R.id.RatioSort);
        agesort = (Button) findViewById(R.id.AgeSort);


        back = (ImageButton) findViewById(R.id.MovieListBack);
        movieticketing1 = (ImageButton) findViewById(R.id.MovieTicketing1);
        movieticketing2 = (ImageButton) findViewById(R.id.MovieTicketing2);
        movieticketing3 = (ImageButton) findViewById(R.id.MovieTicketing3);

        unsatisfactory = new Dialog(MovieList.this);
        unsatisfactory.setContentView(R.layout.movielistunsatisfactorydialog);

        nonmember = new Dialog(MovieList.this);
        nonmember.setContentView(R.layout.movielistnonmember);

        movielistlogout.setOnClickListener(new View.OnClickListener() { // /* (로그아웃) 로그인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),LoginScreen.class);
                startActivity(intent);
            }
        }); // (로그아웃) 로그인으로 이동 */

        back.setOnClickListener(new View.OnClickListener() { // /* (뒤로가기) 메인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        }); // 메인으로 이동 */


        movieticketing1.setOnClickListener(new View.OnClickListener() { // (MovieTicketing1 첫번째 상단 예매버튼) 클릭하면
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),ZootopiaTime.class); // 이동
                startActivity(intent);
            }
        });

        /*
        movieticketing1.setOnClickListener(new View.OnClickListener() { // 어벤져스 예매를 클릭하면
            @Override
            public void onClick(View v) { showunsatisfactory(); } // 예매 불가능 대화상자 출력
        });

        movieticketing1.setOnClickListener(new View.OnClickListener() { // 어벤져스 예매를 클릭하면
            @Override
            public void onClick(View v) { shownonmember(); } // 비회원 생년월일 대화상자 출력
        });
*/

        movieticketing2.setOnClickListener(new View.OnClickListener() { // (MovieTicketing2 두번째 중단 예매버튼) 클릭하면
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),AvengersTime.class); // 이동
                startActivity(intent);
            }
        });
/*
        movieticketing2.setOnClickListener(new View.OnClickListener() { // 어벤져스 예매를 클릭하면
            @Override
            public void onClick(View v) { showunsatisfactory(); } // 예매 불가능 대화상자 출력
        });

        movieticketing2.setOnClickListener(new View.OnClickListener() { // 어벤져스 예매를 클릭하면
            @Override
            public void onClick(View v) { shownonmember(); } // 비회원 생년월일 대화상자 출력
        });
*/

        movieticketing3.setOnClickListener(new View.OnClickListener() { // (MovieTicketing3 세번째 하단 예매버튼) 클릭하면
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),AvengersTime.class); // 이동
                startActivity(intent);
            }
        });
/*
        movieticketing3.setOnClickListener(new View.OnClickListener() { // 신세계 예매를 클릭하면
            @Override
            public void onClick(View v) { showunsatisfactory();
            } // 예매 불가능 대화상자 출력
        });

        movieticketing3.setOnClickListener(new View.OnClickListener() { // 신세계 예매를 클릭하면
            @Override
            public void onClick(View v) { shownonmember(); } // 비회원 생년월일 대화상자 출력
        });
*/
        scoresort.setOnClickListener(new View.OnClickListener() { // 평점순을 클릭하면
            @Override
            public void onClick(View v) {
                scoresort.setTextColor(Color.RED);
                ratiosort.setTextColor(Color.BLACK);
                agesort.setTextColor(Color.BLACK);

            }
        });

        ratiosort.setOnClickListener(new View.OnClickListener() { // 예매율순을 클릭하면
            @Override
            public void onClick(View v) {
                ratiosort.setTextColor(Color.RED);
                scoresort.setTextColor(Color.BLACK);
                agesort.setTextColor(Color.BLACK);

            }
        });

        agesort.setOnClickListener(new View.OnClickListener() { // 관람등급순을 클릭하면
            @Override
            public void onClick(View v) {
                agesort.setTextColor(Color.RED);
                ratiosort.setTextColor(Color.BLACK);
                scoresort.setTextColor(Color.BLACK);

            }
        });


        genrepopup.setOnClickListener(new View.OnClickListener() { // /* 장르 팝업메뉴
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(getApplicationContext(), v);

                getMenuInflater().inflate(R.menu.genrepopup, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.Animation:
                                //원하는 실행 입력
                                break;
                            case R.id.Action:
                                //원하는 실행 입력
                                break;
                            case R.id.Drama:
                                //원하는 실행 입력
                                break;
                        }
                        return false;
                    }
                });
                popup.show();
            }
        }); // 장르 팝업메뉴 */
    }

    public void showunsatisfactory() { // 예매 불가능 대화상자
        unsatisfactory.show();

        Button movieunok = unsatisfactory.findViewById(R.id.MovieunsatisfactoryOk); // 확인버튼을 누르면
        movieunok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unsatisfactory.dismiss(); // 다이얼로그 닫기
                }
            });
    }

    public void shownonmember() { // 비회원 생년월일 입력 대화상자
        nonmember.show();

        Button nonmemberok = nonmember.findViewById(R.id.MovieNonmemberOk); // 확인 버튼을 누르면
        nonmemberok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //원하는 기능 구현
                //원하는 기능 구현
                nonmember.dismiss(); // 다이얼로그 닫기
            }
        });

        Button nonmembercancel = nonmember.findViewById(R.id.MovieNonmemberCancel); // 취소 버튼을 누르면
        nonmembercancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //원하는 기능 구현
                //원하는 기능 구현
                nonmember.dismiss(); // 다이얼로그 닫기
            }
        });
    }
}