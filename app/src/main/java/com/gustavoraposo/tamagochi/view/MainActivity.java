package com.gustavoraposo.tamagochi.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.gustavoraposo.tamagochi.R;
import com.gustavoraposo.tamagochi.viewmodel.main.MainViewModel;
import com.gustavoraposo.tamagochi.viewmodel.main.MainViewModelFactory;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = ViewModelProviders.of(
                this, new MainViewModelFactory()
        ).get(MainViewModel.class);
    }
}