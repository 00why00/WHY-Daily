package com.why.whydaily.ui.study.Math;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MathViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MathViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Math fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
