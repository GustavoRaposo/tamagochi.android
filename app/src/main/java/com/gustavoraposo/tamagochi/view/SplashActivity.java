package com.gustavoraposo.tamagochi.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import com.gustavoraposo.tamagochi.R;
import com.gustavoraposo.tamagochi.viewmodel.splash.SplashViewModel;
import com.gustavoraposo.tamagochi.viewmodel.splash.SplashViewModelFactory;

public class SplashActivity extends AppCompatActivity {

    private SplashViewModel splashViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashViewModel = ViewModelProviders.of(
                this, new SplashViewModelFactory()
        ).get(SplashViewModel.class);

        startActivity(new Intent(this, LoginActivity.class));
    }
}