package com.zhaoshenghua.circlebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CircleBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bar = (CircleBar) findViewById(R.id.bar);
        bar.setMaxstepnumber(100);
//        int[] mColors = new int[]{0xFF123456, 0xFF369852, 0xFF147852};
//        bar.setShaderColor(mColors);
        bar.update(50, 3000);
    }
}
