package com.example.mainlibrary;

import com.example.commonlibrary.IDisplay;
import com.google.auto.service.AutoService;

/**
 * Created by lijie on 2019/4/17.
 */
@AutoService(IDisplay.class)
public class Display implements IDisplay {
    @Override
    public String getDisplay() {
        return "啊哈哈哈哈哈";
    }
}
