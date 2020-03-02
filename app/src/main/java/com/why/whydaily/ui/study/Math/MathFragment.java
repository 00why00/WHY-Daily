package com.why.whydaily.ui.study.Math;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.why.whydaily.R;

public class MathFragment extends Fragment {

    private MathViewModel mathViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mathViewModel =
                ViewModelProviders.of(this).get(MathViewModel.class);
        View root = inflater.inflate(R.layout.fragment_math, container, false);
        final TextView textView = root.findViewById(R.id.text_math);
        mathViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
