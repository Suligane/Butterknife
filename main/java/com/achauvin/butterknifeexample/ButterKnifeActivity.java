package com.achauvin.butterknifeexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by achau on 2017-05-25.
 */

public class ButterKnifeActivity extends AppCompatActivity {

    /**
     * Tell the ButterKnife library about the widgets you want it to find.
     */
    @BindView(R.id.button) Button button;
    @BindView(R.id.textView) TextView textView;
    @BindView(R.id.textView2) TextView textView2;
    @BindView(R.id.textView3) TextView textView3;
    @BindView(R.id.textView4) TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.butter_knife_activity);

        /**
         * Mapping to the previously declared widgets.
         */
        ButterKnife.bind(this);

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
