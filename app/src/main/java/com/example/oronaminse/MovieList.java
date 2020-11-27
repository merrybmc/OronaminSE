package com.example.oronaminse;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MovieList extends AppCompatActivity {
    ImageView Movie_Img1,Movie_Img2,Movie_Img3, Movie_Img4,Movie_Img5,Movie_Img6;
    TextView Movie_Text1,Movie_Text2,Movie_Text3, Movie_Grade1,Movie_Grade2,Movie_Grade3, Movie_Rating1,Movie_Rating2,Movie_Rating3, Movie_Genre1,Movie_Genre2,Movie_Genre3 ;
    int x=0;
    Button genrepopup,movielistlogout,scoresort,ratiosort,agesort;
    ImageButton back,movieticketing1,movieticketing2,movieticketing3;
    Dialog unsatisfactory;
    Dialog nonmember;
    double jutopia_grade=9.36;
    double Avengers_grade=9.50;
    double Worldnew_grade=7.22;
    String title1="어벤져스 : 앤드게임";
    String title2="주토피아";
    String title3="신세계";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movielistlayout);

        Movie_Img1 = (ImageView) findViewById(R.id.MovieImg1);
        Movie_Img2 = (ImageView) findViewById(R.id.MovieImg2);
        Movie_Img3 = (ImageView) findViewById(R.id.MovieImg3);
        Movie_Img4 = (ImageView) findViewById(R.id.Movieimg4);
        Movie_Img5 = (ImageView) findViewById(R.id.Movieimg5);
        Movie_Img6 = (ImageView) findViewById(R.id.Movieimg6);

        Movie_Text1 = (TextView) findViewById(R.id.MovieText1);
        Movie_Text2 = (TextView) findViewById(R.id.MovieText2);
        Movie_Text3 = (TextView) findViewById(R.id.MovieText3);
        Movie_Grade1 = (TextView) findViewById(R.id.MovieGrade1);
        Movie_Grade2 = (TextView) findViewById(R.id.MovieGrade2);
        Movie_Grade3 = (TextView) findViewById(R.id.MovieGrade3);

        Movie_Rating1 = (TextView) findViewById(R.id.MovieRating1);
        Movie_Rating2 = (TextView) findViewById(R.id.MovieRating2);
        Movie_Rating3 = (TextView) findViewById(R.id.MovieRating3);

        Movie_Genre1 = (TextView) findViewById(R.id.MovieGenre1);
        Movie_Genre2 = (TextView) findViewById(R.id.MovieGenre2);
        Movie_Genre3 = (TextView) findViewById(R.id.MovieGenre3);

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
                if(x==1){
                    Intent intent1 = new Intent (getApplicationContext(),AvengersTime.class); // 이동
                    startActivity(intent1);
                }
                if(x==2){
                    Intent intent2 = new Intent (getApplicationContext(),AvengersTime.class); // 이동
                    startActivity(intent2);
                }
                if(x==3){
                    Intent intent3 = new Intent (getApplicationContext(),ZootopiaTime.class); // 이동
                    startActivity(intent3);
                }
                if(x==4){
                    Intent intent4 = new Intent (getApplicationContext(),WorldnewTime.class); // 이동
                    startActivity(intent4);
                }
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
                if(x==1){
                    Intent intent1 = new Intent (getApplicationContext(),ZootopiaTime.class); // 이동
                    startActivity(intent1);
                }
                if(x==2){
                    Intent intent2 = new Intent (getApplicationContext(),WorldnewTime.class); // 이동
                    startActivity(intent2);
                }
                if(x==3){
                    Intent intent3 = new Intent (getApplicationContext(),AvengersTime.class); // 이동
                    startActivity(intent3);
                }
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

                    Intent intent = new Intent(getApplicationContext(), WorldnewTime.class); // 이동
                    startActivity(intent);


                if(x==1){
                    Intent intent1 = new Intent (getApplicationContext(),WorldnewTime.class); // 이동
                    startActivity(intent1);
                }
                if(x==2){
                    Intent intent2 = new Intent (getApplicationContext(),ZootopiaTime.class); // 이동
                    startActivity(intent2);
                }
                if(x==3){
                    Intent intent3 = new Intent (getApplicationContext(),WorldnewTime.class); // 이동
                    startActivity(intent3);
                }
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
                x=1;
                scoresort.setTextColor(Color.RED);
                ratiosort.setTextColor(Color.BLACK);
                agesort.setTextColor(Color.BLACK);

                Movie_Img1.setVisibility(View.VISIBLE);
                Movie_Text1.setVisibility(View.VISIBLE);
                Movie_Grade1.setVisibility(View.VISIBLE);
                Movie_Rating1.setVisibility(View.VISIBLE);
                Movie_Genre1.setVisibility(View.VISIBLE);
                Movie_Img4.setVisibility(View.VISIBLE);

                Movie_Img2.setVisibility(View.VISIBLE);
                Movie_Text2.setVisibility(View.VISIBLE);
                Movie_Grade2.setVisibility(View.VISIBLE);
                Movie_Rating2.setVisibility(View.VISIBLE);
                Movie_Genre2.setVisibility(View.VISIBLE);
                Movie_Img5.setVisibility(View.VISIBLE);
                movieticketing2.setVisibility(View.VISIBLE);

                Movie_Img3.setVisibility(View.VISIBLE);
                Movie_Text3.setVisibility(View.VISIBLE);
                Movie_Grade3.setVisibility(View.VISIBLE);
                Movie_Rating3.setVisibility(View.VISIBLE);
                Movie_Genre3.setVisibility(View.VISIBLE);
                Movie_Img6.setVisibility(View.VISIBLE);
                movieticketing3.setVisibility(View.VISIBLE);

                Movie_Img1.setImageResource(R.drawable.avengers);
                Movie_Text1.setText(title1);
                Movie_Grade1.setText("★9.50 ");
                Movie_Rating1.setText("예매율 71.8");
                Movie_Genre1.setText("액션");
                Movie_Img4.setImageResource(R.drawable.twelve);

                Movie_Img2.setImageResource(R.drawable.zootopia);
                Movie_Text2.setText(title2);
                Movie_Grade2.setText("★9.36 ");
                Movie_Rating2.setText("예매율 18.4");
                Movie_Genre2.setText("애니매이션");
                Movie_Img5.setImageResource(R.drawable.all);


            }
        });

        ratiosort.setOnClickListener(new View.OnClickListener() { // 예매율순을 클릭하면
            @Override
            public void onClick(View v) {
                x=2;
                ratiosort.setTextColor(Color.RED);
                scoresort.setTextColor(Color.BLACK);
                agesort.setTextColor(Color.BLACK);

                Movie_Img1.setVisibility(View.VISIBLE);
                Movie_Text1.setVisibility(View.VISIBLE);
                Movie_Grade1.setVisibility(View.VISIBLE);
                Movie_Rating1.setVisibility(View.VISIBLE);
                Movie_Genre1.setVisibility(View.VISIBLE);
                Movie_Img4.setVisibility(View.VISIBLE);

                Movie_Img2.setVisibility(View.VISIBLE);
                Movie_Text2.setVisibility(View.VISIBLE);
                Movie_Grade2.setVisibility(View.VISIBLE);
                Movie_Rating2.setVisibility(View.VISIBLE);
                Movie_Genre2.setVisibility(View.VISIBLE);
                Movie_Img5.setVisibility(View.VISIBLE);
                movieticketing2.setVisibility(View.VISIBLE);

                Movie_Img3.setVisibility(View.VISIBLE);
                Movie_Text3.setVisibility(View.VISIBLE);
                Movie_Grade3.setVisibility(View.VISIBLE);
                Movie_Rating3.setVisibility(View.VISIBLE);
                Movie_Genre3.setVisibility(View.VISIBLE);
                Movie_Img6.setVisibility(View.VISIBLE);
                movieticketing3.setVisibility(View.VISIBLE);

                Movie_Img1.setImageResource(R.drawable.avengers);
                Movie_Text1.setText(title1);
                Movie_Grade1.setText("★9.50 ");
                Movie_Rating1.setText("예매율 71.8");
                Movie_Genre1.setText("액션");
                Movie_Img4.setImageResource(R.drawable.twelve);

                Movie_Img2.setImageResource(R.drawable.worldnew);
                Movie_Text2.setText(title3);
                Movie_Grade2.setText("★7.22 ");
                Movie_Rating2.setText("예매율 71.8");
                Movie_Genre2.setText("드라마");
                Movie_Img5.setImageResource(R.drawable.nineteen);

                Movie_Img3.setImageResource(R.drawable.zootopia);
                Movie_Text3.setText(title2);
                Movie_Grade3.setText("★9.36 ");
                Movie_Rating3.setText("예매율 18.4%");
                Movie_Genre3.setText("애니메이션");
                Movie_Img6.setImageResource(R.drawable.all);

            }
        });

        agesort.setOnClickListener(new View.OnClickListener() { // 관람등급순을 클릭하면
            @Override
            public void onClick(View v) {
                x=3;
                agesort.setTextColor(Color.RED);
                ratiosort.setTextColor(Color.BLACK);
                scoresort.setTextColor(Color.BLACK);

                Movie_Img1.setVisibility(View.VISIBLE);
                Movie_Text1.setVisibility(View.VISIBLE);
                Movie_Grade1.setVisibility(View.VISIBLE);
                Movie_Rating1.setVisibility(View.VISIBLE);
                Movie_Genre1.setVisibility(View.VISIBLE);
                Movie_Img4.setVisibility(View.VISIBLE);

                Movie_Img2.setVisibility(View.VISIBLE);
                Movie_Text2.setVisibility(View.VISIBLE);
                Movie_Grade2.setVisibility(View.VISIBLE);
                Movie_Rating2.setVisibility(View.VISIBLE);
                Movie_Genre2.setVisibility(View.VISIBLE);
                Movie_Img5.setVisibility(View.VISIBLE);
                movieticketing2.setVisibility(View.VISIBLE);

                Movie_Img3.setVisibility(View.VISIBLE);
                Movie_Text3.setVisibility(View.VISIBLE);
                Movie_Grade3.setVisibility(View.VISIBLE);
                Movie_Rating3.setVisibility(View.VISIBLE);
                Movie_Genre3.setVisibility(View.VISIBLE);
                Movie_Img6.setVisibility(View.VISIBLE);
                movieticketing3.setVisibility(View.VISIBLE);

                Movie_Img1.setImageResource(R.drawable.zootopia);
                Movie_Text1.setText(title2);
                Movie_Grade1.setText("★9.36 ");
                Movie_Rating1.setText("예매율 18.4%");
                Movie_Genre1.setText("애니메이션");
                Movie_Img4.setImageResource(R.drawable.all);

                Movie_Img2.setImageResource(R.drawable.avengers);
                Movie_Text2.setText(title1);
                Movie_Grade2.setText("★9.50 ");
                Movie_Rating2.setText("예매율 71.8%");
                Movie_Genre2.setText("액션");
                Movie_Img5.setImageResource(R.drawable.twelve);

                Movie_Img3.setImageResource(R.drawable.worldnew);
                Movie_Text3.setText(title3);
                Movie_Grade3.setText("★7.22 ");
                Movie_Rating3.setText("예매율 71.8%");
                Movie_Genre3.setText("드라마");
                Movie_Img6.setImageResource(R.drawable.nineteen);
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

                                Movie_Img1.setImageResource(R.drawable.zootopia);
                                Movie_Text1.setText(title2);
                                Movie_Grade1.setText("★9.36 ");
                                Movie_Rating1.setText("예매율 18.4%");
                                Movie_Genre1.setText("애니메이션");
                                Movie_Img4.setImageResource(R.drawable.all);

                                Movie_Img2.setVisibility(View.INVISIBLE);
                                Movie_Text2.setVisibility(View.INVISIBLE);
                                Movie_Grade2.setVisibility(View.INVISIBLE);
                                Movie_Rating2.setVisibility(View.INVISIBLE);
                                Movie_Genre2.setVisibility(View.INVISIBLE);
                                Movie_Img5.setVisibility(View.INVISIBLE);
                                movieticketing2.setVisibility(View.INVISIBLE);

                                Movie_Img3.setVisibility(View.INVISIBLE);
                                Movie_Text3.setVisibility(View.INVISIBLE);
                                Movie_Grade3.setVisibility(View.INVISIBLE);
                                Movie_Rating3.setVisibility(View.INVISIBLE);
                                Movie_Genre3.setVisibility(View.INVISIBLE);
                                Movie_Img6.setVisibility(View.INVISIBLE);
                                movieticketing3.setVisibility(View.INVISIBLE);
                                break;
                            case R.id.Action:
                                //원하는 실행 입력
                                x=2;
                                Movie_Img1.setImageResource(R.drawable.avengers);
                                Movie_Text1.setText(title1);
                                Movie_Grade1.setText("★9.50 ");
                                Movie_Rating1.setText("예매율 71.8%");
                                Movie_Genre1.setText("액션");
                                Movie_Img4.setImageResource(R.drawable.twelve);

                                Movie_Img2.setVisibility(View.INVISIBLE);
                                Movie_Text2.setVisibility(View.INVISIBLE);
                                Movie_Grade2.setVisibility(View.INVISIBLE);
                                Movie_Rating2.setVisibility(View.INVISIBLE);
                                Movie_Genre2.setVisibility(View.INVISIBLE);
                                Movie_Img5.setVisibility(View.INVISIBLE);
                                movieticketing2.setVisibility(View.INVISIBLE);

                                Movie_Img3.setVisibility(View.INVISIBLE);
                                Movie_Text3.setVisibility(View.INVISIBLE);
                                Movie_Grade3.setVisibility(View.INVISIBLE);
                                Movie_Rating3.setVisibility(View.INVISIBLE);
                                Movie_Genre3.setVisibility(View.INVISIBLE);
                                Movie_Img6.setVisibility(View.INVISIBLE);
                                movieticketing3.setVisibility(View.INVISIBLE);
                                break;
                            case R.id.Drama:
                                //원하는 실행 입력
                                x=4;
                                Movie_Img1.setImageResource(R.drawable.worldnew);
                                Movie_Text1.setText(title3);
                                Movie_Grade1.setText("★7.22 ");
                                Movie_Rating1.setText("예매율 71.8%");
                                Movie_Genre1.setText("드라마");
                                Movie_Img4.setImageResource(R.drawable.nineteen);

                                Movie_Img2.setVisibility(View.INVISIBLE);
                                Movie_Text2.setVisibility(View.INVISIBLE);
                                Movie_Grade2.setVisibility(View.INVISIBLE);
                                Movie_Rating2.setVisibility(View.INVISIBLE);
                                Movie_Genre2.setVisibility(View.INVISIBLE);
                                Movie_Img5.setVisibility(View.INVISIBLE);
                                movieticketing2.setVisibility(View.INVISIBLE);

                                Movie_Img3.setVisibility(View.INVISIBLE);
                                Movie_Text3.setVisibility(View.INVISIBLE);
                                Movie_Grade3.setVisibility(View.INVISIBLE);
                                Movie_Rating3.setVisibility(View.INVISIBLE);
                                Movie_Genre3.setVisibility(View.INVISIBLE);
                                Movie_Img6.setVisibility(View.INVISIBLE);
                                movieticketing3.setVisibility(View.INVISIBLE);
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