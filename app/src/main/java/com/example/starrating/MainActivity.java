package com.example.starrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rat(View view) {
        RatingBar ratingbar;
        ratingbar = (RatingBar) findViewById(R.id.ratingBar);
        String rating = String.valueOf(ratingbar.getRating());
        Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_SHORT).show();
    }
}
