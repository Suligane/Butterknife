package com.achauvin.butterknifeexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by achau on 2017-05-25.
 */

public class NoButterKnifeActivity extends AppCompatActivity {

    /**
     * Declaring all the widgets from the layout that need to be accessed at runtime.
     */
    Button button;
    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_butter_knife_activity);

        /**
         * Mapping to the previously declared widgets
         */
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        button = (Button) findViewById(R.id.button);

        /**
         * Adding click event to the button
         */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Change text when the button is clicked.
                 */
                textView.setText("This was just changed.");
                textView2.setText("This was just changed too!");
                textView3.setText("This was definitely changed!");
                textView4.setText("This was absolutely changed!");
            }
        });

    }

}
