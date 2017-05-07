package com.example.yulizar.courtstage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        score = (Integer) Integer.parseInt(((TextView) findViewById(R.id.team_a_score)).getText().toString());
    }

    public void threePoints(View view){
//        score = (Integer) Integer.parseInt(((TextView) findViewById(R.id.team_a_score)).getText().toString());
        scoreA = scoreA+3;
        updateScoreA(scoreA);
    }

    public void twoPoints(View view){
//        score = (Integer) Integer.parseInt(((TextView) findViewById(R.id.team_a_score)).getText().toString());
        scoreA = scoreA + 2;
        updateScoreA(scoreA);
    }

    public void freeThrow(View view){
//        score = (Integer) Integer.parseInt(((TextView) findViewById(R.id.team_a_score)).getText().toString());
        scoreA++;
        updateScoreA(scoreA);
    }

    public void updateScoreA(int score){
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        scoreTextView.setText(String.valueOf(score));
    }

//    -----------------------------------------Batas method Score A-----------------------------------------


    public void threePoints_B(View view){
//        score = (Integer) Integer.parseInt(((TextView) findViewById(R.id.team_a_score)).getText().toString());
        scoreB = scoreB+3;
        updateScoreB(scoreB);
    }

    public void twoPoints_B(View view){
//        score = (Integer) Integer.parseInt(((TextView) findViewById(R.id.team_a_score)).getText().toString());
        scoreB = scoreB + 2;
        updateScoreB(scoreB);
    }

    public void freeThrow_B(View view){
//        score = (Integer) Integer.parseInt(((TextView) findViewById(R.id.team_a_score)).getText().toString());
        scoreB++;
        updateScoreB(scoreB);
    }

    public void updateScoreB(int score){
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
        scoreTextView.setText(String.valueOf(score));
    }

//    -----------------------------------------Method Reset------------------------------------------------

    public void Reset(View view){
        updateScoreA(0);
        updateScoreB(0);
    }
}
