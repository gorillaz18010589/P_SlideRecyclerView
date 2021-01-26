package com.example.p_sliderecyclerview;
//實現仿ios側滑
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.p_sliderecyclerview.activity.SlideRecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toPage2(View view) {
        startActivity(new Intent(MainActivity.this, SlideRecyclerViewActivity.class));
    }
}