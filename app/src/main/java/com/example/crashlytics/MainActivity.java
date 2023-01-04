package com.example.crashlytics;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;

public class MainActivity<val> extends AppCompatActivity {

    private Throwable Exception;
    private Button btnChange;
    private TextView txt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChange =findViewById(R.id.btnchange);
        txt = findViewById(R.id.txt);

        FirebaseCrashlytics.getInstance().log("rrrr");
            Button crashButton = new Button(this);
            crashButton.setText("Test Crash");
            crashButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    IpayLog.e("test","msg");

                }

            });

            addContentView(crashButton, new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));




    }


}