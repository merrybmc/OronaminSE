package com.example.oronaminse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView MainVideo;
    Button mainlogout;
    ImageButton mainreservation,mainstore,mainrecord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainVideo = (VideoView)findViewById(R.id.MainVideo);
        mainlogout = (Button)findViewById(R.id.MainLogout);
        mainreservation = (ImageButton) findViewById(R.id.MainReservation);
        mainstore = (ImageButton)findViewById(R.id.MainStore);
        mainrecord = (ImageButton)findViewById(R.id.MainRecord);

        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/raw/endgame"); // /* 비디오 재생
        MainVideo.setVideoURI(videoUri);

        MainVideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            } //  비디오 재생 */
        });

        mainlogout.setOnClickListener(new View.OnClickListener() { // /* (로그아웃) 로그인으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),LoginScreen.class);
                startActivity(intent);
            }
        }); // (로그아웃) 로그인으로 이동 */

        mainreservation.setOnClickListener(new View.OnClickListener() { // /* 영화예매로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),MovieList.class);
                startActivity(intent);
            }
        }); // 영화예매로 이동 */

        mainstore.setOnClickListener(new View.OnClickListener() { // /* 영화예매로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),SweetShop.class);
                startActivity(intent);
            }
        }); // 영화예매로 이동 */

        mainrecord.setOnClickListener(new View.OnClickListener() { // /* 예매내역으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),Details.class);
                startActivity(intent);
            }
        }); // 예매내역으로 이동 */


    }
}