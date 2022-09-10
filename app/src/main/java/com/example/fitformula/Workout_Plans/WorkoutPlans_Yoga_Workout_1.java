package com.example.fitformula.Workout_Plans;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.fitformula.R;

public class WorkoutPlans_Yoga_Workout_1 extends AppCompatActivity {

    DrawerLayout dl_3;
    private Toolbar tb_1;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_plans_yoga_workout1);

        /*--------------------Hooks--------------------*/
        dl_3 = findViewById(R.id.dl_WorkoutPlans_Yoga_Workout_1);
        Toolbar tb_1 = findViewById(R.id.tb_WorkoutPlans_Yoga_1);

        /*--------------------Tool Bar--------------------*/
        setSupportActionBar(tb_1);
        getSupportActionBar().setTitle("Yoga Stress Relief");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}