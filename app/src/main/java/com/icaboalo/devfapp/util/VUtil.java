package com.icaboalo.devfapp.util;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by icaboalo on 6/04/16.
 */
public class VUtil {
    public static void replaceFragment(int view, FragmentManager fragmentManager, Fragment fragment){
        fragmentManager.beginTransaction().replace(view, fragment).commit();
    }
}
