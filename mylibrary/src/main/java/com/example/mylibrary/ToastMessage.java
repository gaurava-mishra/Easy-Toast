package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    /**
     * @param context context of the conponent in which toast should appear
     * @param message string message which need to be show
     */
    public static void showToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
