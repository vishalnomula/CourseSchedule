package com.example.courseschedule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private Schedule mSchedule;
    private TextView mWeekNo;
    private TextView mDate;
    private TextView mLectureTopic;
    private TextView mLabTopic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mWeekNo = findViewById(R.id.tvWeekNo);
        mDate = findViewById(R.id.tvDate);
        mLectureTopic = findViewById(R.id.tvLectureTopic);
        mLabTopic = findViewById(R.id.tvLabTopic);

        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        mSchedule = Schedule.getDummySchedule().get(position);
        setTitle(mSchedule.getWeekNo());
        mWeekNo.setText(mSchedule.getWeekNo());
        mDate.setText(mSchedule.getDate());
        mLectureTopic.setText(mSchedule.getLectureTopic());
        mLabTopic.setText(mSchedule.getLabTopic());
    }

}

