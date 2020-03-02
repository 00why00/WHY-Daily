package com.why.whydaily.ui.study.Computer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ComputerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ComputerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Computer fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
