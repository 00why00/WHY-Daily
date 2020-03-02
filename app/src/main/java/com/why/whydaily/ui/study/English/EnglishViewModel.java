package com.why.whydaily.ui.study.English;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EnglishViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EnglishViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is English fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
