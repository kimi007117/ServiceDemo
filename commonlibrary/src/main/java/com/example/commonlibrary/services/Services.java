package com.example.commonlibrary.services;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by lijie on 2019/4/17.
 */
public final class Services {
    public static <T> T load(Class<T> tClass) throws ServiceNotFoundException {
        Iterator<T> iterator = ServiceLoader.load(tClass).iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        } else {
            throw new ServiceNotFoundException();
        }
    }
}
