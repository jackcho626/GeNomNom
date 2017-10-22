package com.example.android.nutrientassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class HomepageActivity extends AppCompatActivity {
    LinearLayout mAddPrefButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        mAddPrefButton = (LinearLayout) findViewById(R.id.add_preferences_button);
    }

    // Called when user taps
    public void sendMessage (View view) {

    }

    public View.OnClickListener prefListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.add_preferences_button) {

            }
        }
    };

    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }
}
