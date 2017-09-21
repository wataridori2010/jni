package com.example.myandroid.hellojni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hellojni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellojni);
        TextView tv = (TextView)findViewById(R.id.hello_textview);
        tv.setText( stringFromJNI() );
    }

    public native String  stringFromJNI();
    //public native String  unimplementedStringFromJNI();

    static {
        System.loadLibrary("hello-jni");
    }

}
