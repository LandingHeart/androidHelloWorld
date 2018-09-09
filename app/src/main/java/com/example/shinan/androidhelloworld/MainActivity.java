package com.example.shinan.androidhelloworld;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.inputmethod.InputMethodManager;
import android.view.WindowManager;
import android.graphics.Color;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View view = this.getWindow().getDecorView();
        final TextView text = (TextView) findViewById(R.id.text1);
        final TextView text2 = (TextView) findViewById(R.id.text2);
        text2.setTextColor(Color.BLACK);

        Button onClick = (Button) findViewById(R.id.changeButton);
        Button onClick2 = (Button) findViewById(R.id.changeButton2);
        Button onClick3 = (Button) findViewById(R.id.changeButton3);
        onClick.setOnClickListener(this);
        onClick2.setOnClickListener(this);
        onClick3.setOnClickListener(this);


        final ConstraintLayout layout = (ConstraintLayout) findViewById (R.id.vLayout);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(" ");
                text2.setText("Hello from Shinan");
                text2.setTextColor(Color.BLACK);
                view.setBackgroundColor(Color.WHITE);


            }
        });

    }

    @Override
    public void onClick(View v) {
        View view = this.getWindow().getDecorView();
        TextView text = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);
        final int ORANGE = 0xFFFF3300;

        switch (v.getId()){
            case R.id.changeButton:
                text2.setText(text.getText());
                text.setText("");
                text.requestFocus();

                break;

            case R.id.changeButton2:
                text2.setTextColor(ORANGE);
                break;

            case R.id.changeButton3:

                view.setBackgroundColor(0xfff00000);
                break;
        }


    }
}
