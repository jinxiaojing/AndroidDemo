package com.wanjia.wplus;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class HelloWorldActivity extends Activity {

    private com.wanjia.wplus.demoView demoView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        demoView = findViewById(R.id.dv_view);
        EditText et_view = findViewById(R.id.et_view);
        findViewById(R.id.bt_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_view.getText() != null && !et_view.getText().toString().equals("")) {
                    demoView.setSelect(Integer.parseInt(et_view.getText().toString()));
                }
            }
        });
        List<String> oLists = new ArrayList<>();
        List<String> iLists = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            oLists.add(String.valueOf(i));
            iLists.add("$ " + i);
        }
        demoView.setOutsideList(oLists);
        demoView.setInsideList(iLists);
        demoView.setSelect(3);
    }
}
