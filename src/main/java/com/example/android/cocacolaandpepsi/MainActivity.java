package com.example.android.cocacolaandpepsi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int udacicolaVotes = 0 ;
    int pepcityVotes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void voteUdacicola (View view) {
        udacicolaVotes = udacicolaVotes + 1;
        showMeVotes ();
    }

    public void votePepcity (View view) {
        pepcityVotes = pepcityVotes + 1;
        showMeVotes ();
    }

    public void showMeVotes () {
        display(udacicolaVotes + " vs. " + pepcityVotes);
    }
    private void display(String text) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText( text);
    }
}
