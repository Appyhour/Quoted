package com.example.ruairi.quoted;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class Quotes extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        final TextView clickHere = (TextView)findViewById(R.id.instructions);
        final TextView quotes= (TextView)findViewById(R.id.quotesGoHere);

        View.OnClickListener newClicker = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNums = new Random();
                int ranNumber = randomNums.nextInt(17);

                String[] listChoices = {"''Winners never quit and quitters never win''",
                        "''There's no traffic on the extra mile''",
                        "''Pain is temporary, pride is forever''",
                        "''Go hard or go home''",
                        "''The best time to plant a tree was 20 years ago. The second best time is now''",
                        "''Suck it up buttercup''",
                        "''Half the battle is showing up''",
                        "''The darkest hour only lasts 60 minutes''",
                        "''It's not the hours you put into the work, It's the work you put into the hours''",
                        "''Keep hurling never mind the ball''",
                        "''Get up them stairs''",
                        "''It's the fight in the dog not the dog in the fight''",
                        "''Chin up head down''",
                        "''Be better''",
                        "''Just do it''",
                        "''Impossible is nothing''",
                        "''Refuse to lose''"};



                quotes.setText(listChoices[ranNumber]);


            }
        };

        clickHere.setOnClickListener(newClicker);

    };

}

