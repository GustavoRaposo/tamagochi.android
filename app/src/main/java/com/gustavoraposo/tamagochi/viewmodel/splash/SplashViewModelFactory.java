package com.gustavoraposo.tamagochi.viewmodel.splash;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class SplashViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    public SplashViewModelFactory(){

    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new SplashViewModel();
    }
}
