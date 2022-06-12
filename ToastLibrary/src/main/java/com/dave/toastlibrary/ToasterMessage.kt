package com.dave.toastlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {

     fun makeToast(context: Context, message: String) {
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();

    }

}