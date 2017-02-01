package com.jcentersample.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jcentersample.sdk.Platform;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        TextView text = (TextView) findViewById(R.id.test_text_view);

        if(text != null) {
            text.setText(Platform.testPlatform());
        }
    }
}
