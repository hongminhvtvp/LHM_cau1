package com.example.student.lhm_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bttinhtong extends AppCompatActivity {

    Button btn;
    EditText hs1,hs2;
    TextView tongla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bttinhtong);

        hs1=(EditText)findViewById(R.id.id1);
        hs2=(EditText)findViewById(R.id.id2);
        tongla=(TextView)findViewById(R.id.tong);
        btn=(Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(hs1.getText().toString());
                int b=Integer.parseInt(hs2.getText().toString());
                int tongab=a+b;

                tongla.setText("Tổng là : " + tongab);
            }
        });

    }

}
