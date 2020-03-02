package com.why.whydaily.ui.study.Politics;

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

public class PoliticsFragment extends Fragment {

    private PoliticsViewModel politicsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        politicsViewModel =
                ViewModelProviders.of(this).get(PoliticsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_politics, container, false);
        final TextView textView = root.findViewById(R.id.text_politics);
        politicsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
