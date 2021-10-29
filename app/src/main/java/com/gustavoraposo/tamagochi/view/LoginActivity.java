package com.gustavoraposo.tamagochi.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.gustavoraposo.tamagochi.R;
import com.gustavoraposo.tamagochi.viewmodel.login.LoginViewModel;
import com.gustavoraposo.tamagochi.viewmodel.login.LoginViewModelFactory;

public class LoginActivity extends AppCompatActivity {

    private LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginViewModel = ViewModelProviders.of(
                this, new LoginViewModelFactory()
        ).get(LoginViewModel.class);
    }
}