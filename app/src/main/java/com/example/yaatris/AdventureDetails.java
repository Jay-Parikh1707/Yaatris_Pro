package com.example.yaatris;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdventureDetails extends AppCompatActivity  {

    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure_details);

        button = (Button) findViewById(R.id.Bookmyticket);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBookingPage();
            }
        });
    }
        public void openBookingPage() {
            Intent intent = new Intent(this, BookingPage.class);
            startActivity(intent);
        }
    }


