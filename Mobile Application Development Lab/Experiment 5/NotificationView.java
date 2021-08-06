package com.example.experiment5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static com.example.experiment5.R.layout.activity_notification_view;

public class NotificationView extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_notification_view);
        textView = findViewById(R.id.textView);
//getting the notification message
        String message=getIntent().getStringExtra("message");
        textView.setText(message);
    }
}