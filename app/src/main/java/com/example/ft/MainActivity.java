package com.example.ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void New(View view){
        openUrl("https://www.fifa.com/fifaplus/en/tournaments/mens/worldcup/qatar2022/teams/australia/news");
    }
    public void openUrl(String url){
        Uri uri=Uri.parse(url);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
        finish();
    }
    public  void arg(View view)
    {
        openUrl("https://www.fifa.com/fifaplus/en/tournaments/mens/worldcup/qatar2022/teams/argentina/news");
    }
    public void bel(View view)
    {
        openUrl("https://www.fifa.com/fifaplus/en/tournaments/mens/worldcup/qatar2022/teams/belgium/news");
    }
    public void bra(View view){
        openUrl("https://www.fifa.com/fifaplus/en/tournaments/mens/worldcup/qatar2022/teams/brazil/news");
    }
    public void cmr(View view){
        openUrl("https://www.fifa.com/fifaplus/en/tournaments/mens/worldcup/qatar2022/teams/cameroon/news");
    }
    public void can(View view){
        openUrl("https://www.fifa.com/fifaplus/en/tournaments/mens/worldcup/qatar2022/teams/canada/news");
    }
    public void jpn(View view){
        openUrl("https://www.fifa.com/fifaplus/en/tournaments/mens/worldcup/qatar2022/teams/japan/news");
    }
    public void mex(View view){
        openUrl("https://www.fifa.com/fifaplus/en/tournaments/mens/worldcup/qatar2022/teams/mexico/news");
    }
    public void ger(View view){
        openUrl("https://www.fifa.com/fifaplus/en/tournaments/mens/worldcup/qatar2022/teams/germany/news");
    }
    public void gha(View view){
        openUrl("https://www.fifa.com/fifaplus/en/tournaments/mens/worldcup/qatar2022/teams/ghana/news");
    }



}