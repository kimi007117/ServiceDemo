package com.example.librarya;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.commonlibrary.IDisplay;
import com.example.commonlibrary.ITabPage;
import com.example.commonlibrary.services.Services;
import com.google.auto.service.AutoService;

import java.util.ServiceLoader;

/**
 * Created by lijie on 2019/4/17.
 */
@ITabPage(tabName = "用户", iconName = "tab_case")
@AutoService(Fragment.class)
public class AFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String display = Services.load(IDisplay.class).getDisplay();
        Toast.makeText(getActivity(), display+"--用户", Toast.LENGTH_LONG).show();
        return inflater.inflate(R.layout.fragment_a, container, false);
    }
}
