package com.example.libraryb;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.commonlibrary.ITabPage;
import com.google.auto.service.AutoService;

/**
 * Created by lijie on 2019/4/17.
 */
@ITabPage(tabName = "工作", iconName = "tab_effect")
@AutoService(Fragment.class)
public class BFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }
}
