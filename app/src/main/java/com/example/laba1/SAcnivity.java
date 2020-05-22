package com.example.laba1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;


public class SAcnivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sacnivity);



        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear);
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"), RuleBasedNumberFormat.SPELLOUT);
        for(int i = 0; i < 100; i++) {

            final View view = getLayoutInflater().inflate(R.layout.dinamic_element, null);
            TextView text = (TextView) view.findViewById(R.id.text);
            text.setText(nf.format(i +1));
            if(i % 2 == 0) {
                text.setBackgroundColor(Color.WHITE);
            }
            else {
                text.setBackgroundColor(Color.GRAY);
            }
            linearLayout.addView(view);
        }

    }
}
