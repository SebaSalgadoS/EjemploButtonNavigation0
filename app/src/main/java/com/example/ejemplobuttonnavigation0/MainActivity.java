package com.example.ejemplobuttonnavigation0;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Fragmento1 f1 = new Fragmento1();
    Fragmento2 f2 = new Fragmento2();
    Fragmento3 f3 = new Fragmento3();

    BottomNavigationView bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bottom = findViewById(R.id.myBottomNavigationView);
        bottom.setOnItemSelectedListener(this::onNavigationItemSelected);
        cargarFragmento(f1);
    }

    public void cargarFragmento(Fragment f){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.myFrame, f);
        transaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemAvion:
                cargarFragmento(f1);
                return true;
            case R.id.itemAdd:
                cargarFragmento(f2);
                return true;
            case R.id.itemMano:
                cargarFragmento(f3);
                return true;
        }
        return false;
    }
}