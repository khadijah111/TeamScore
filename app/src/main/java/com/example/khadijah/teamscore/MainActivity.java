package com.example.khadijah.teamscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer scoreTeamA=0;
    Integer scoreTeamB=0;
    TextView scoreViewA;
    TextView scoreViewB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewA = (TextView) findViewById(R.id.textView2);
        scoreViewB = (TextView) findViewById(R.id.textView4);
    }

    private void DisplayResults()
    {
        scoreViewA.setText("" +scoreTeamA);
        scoreViewB.setText("" + scoreTeamB);
    }
    public void display1a(View view)
    {
        scoreTeamA= scoreTeamA + 1;
        DisplayResults();
    }
    public void display2a(View view)
    {
        scoreTeamA= scoreTeamA + 2;
        DisplayResults();
    }
    public void display3a(View view)
    {
        scoreTeamA= scoreTeamA + 3;
        DisplayResults();
    }
    public void display1b(View view)
    {
        scoreTeamB= scoreTeamB + 1;
        DisplayResults();
    }
    public void display2b(View view)
    {
        scoreTeamB= scoreTeamB + 2;
        DisplayResults();
    }
    public void display3b(View view)
    {
        scoreTeamB= scoreTeamB + 3;
        DisplayResults();

    }

    public void reset(View view)
    {
        scoreTeamB= 0;
        scoreTeamA= 0;
        DisplayResults();

    }
}
