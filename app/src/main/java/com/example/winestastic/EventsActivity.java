package com.example.winestastic;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;


import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.winestastic.databinding.ActivityEventsBinding;

public class EventsActivity extends AppCompatActivity {
    ListView lista;

    String[] [] datos = {
            {"vinedo", "costo", "dia", "hora"},
            {"Viñedo Azteca", "Costo: $500", "Día: 22 de diciembre", "Hora: 4:50pm"}
    };

    int[] datosImg = {R.drawable.azteca, R.drawable.freixenet, R.drawable.sanjuanito, R.drawable.vinaltura };

    private AppBarConfiguration appBarConfiguration;
    private ActivityEventsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //lista = (ListView) findViewById.R.id.lista);

        binding = ActivityEventsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);


        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main2);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);


    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main2);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}