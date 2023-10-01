package com.example.winestastic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity {

    private MeowBottomNavigation bottomNavigation;
    RelativeLayout settings, person, home, favoritos, calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottomNavigation);
        settings = findViewById(R.id.settings);
        person = findViewById(R.id.person);
        home = findViewById(R.id.home);
        favoritos = findViewById(R.id.favoritos);
        calendar = findViewById(R.id.calendar);




        bottomNavigation.show(3,true);


        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.baseline_settings_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.baseline_person_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.baseline_star_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.baseline_calendar_month_24));


        bottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES

                switch (model.getId()){

                    case 1:

                        settings.setVisibility(View.VISIBLE);
                        person.setVisibility(View.GONE);
                        home.setVisibility(View.GONE);
                        favoritos.setVisibility(View.GONE);
                        calendar.setVisibility(View.GONE);

                        break;

                    case 2:

                        settings.setVisibility(View.GONE);
                        person.setVisibility(View.VISIBLE);
                        home.setVisibility(View.GONE);
                        favoritos.setVisibility(View.GONE);
                        calendar.setVisibility(View.GONE);

                        break;

                    case 3:

                        settings.setVisibility(View.GONE);
                        person.setVisibility(View.GONE);
                        home.setVisibility(View.VISIBLE);
                        favoritos.setVisibility(View.GONE);
                        calendar.setVisibility(View.GONE);

                        break;

                    case 4:

                        settings.setVisibility(View.GONE);
                        person.setVisibility(View.GONE);
                        home.setVisibility(View.GONE);
                        favoritos.setVisibility(View.VISIBLE);
                        calendar.setVisibility(View.GONE);

                        break;

                    case 5:

                        settings.setVisibility(View.GONE);
                        person.setVisibility(View.GONE);
                        home.setVisibility(View.GONE);
                        favoritos.setVisibility(View.GONE);
                        calendar.setVisibility(View.VISIBLE);

                        break;

                }
                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES

                switch (model.getId()){

                    case 1:

                        settings.setVisibility(View.VISIBLE);
                        person.setVisibility(View.GONE);
                        home.setVisibility(View.GONE);
                        favoritos.setVisibility(View.GONE);
                        calendar.setVisibility(View.GONE);

                        break;
                }

                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES

                switch (model.getId()){

                    case 2:

                        settings.setVisibility(View.GONE);
                        person.setVisibility(View.VISIBLE);
                        home.setVisibility(View.GONE);
                        favoritos.setVisibility(View.GONE);
                        calendar.setVisibility(View.GONE);

                        break;
                }

                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES

                switch (model.getId()){

                    case 3:

                        settings.setVisibility(View.GONE);
                        person.setVisibility(View.GONE);
                        home.setVisibility(View.VISIBLE);
                        favoritos.setVisibility(View.GONE);
                        calendar.setVisibility(View.GONE);

                        break;
                }

                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES

                switch (model.getId()){

                    case 4:

                        settings.setVisibility(View.GONE);
                        person.setVisibility(View.GONE);
                        home.setVisibility(View.GONE);
                        favoritos.setVisibility(View.VISIBLE);
                        calendar.setVisibility(View.GONE);

                        break;
                }

                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES

                switch (model.getId()){

                    case 5:

                        settings.setVisibility(View.GONE);
                        person.setVisibility(View.GONE);
                        home.setVisibility(View.GONE);
                        favoritos.setVisibility(View.GONE);
                        calendar.setVisibility(View.VISIBLE);

                        break;
                }

                return null;
            }
        });

    }
}