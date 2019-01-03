package com.example.viewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private static final String EXTRA_JOKE = "extra_joke";
    private TextView mJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mJokeTextView = findViewById(R.id.tv_joke);

        String joke = getIntent().getStringExtra(EXTRA_JOKE);
        if (joke != null && !TextUtils.isEmpty(joke)) {
            mJokeTextView.setText(joke);
        }
    }
}
