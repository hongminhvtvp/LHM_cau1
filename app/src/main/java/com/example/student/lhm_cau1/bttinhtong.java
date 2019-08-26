package com.example.student.lhm_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bttinhtong extends AppCompatActivity {

    Button btn,btn1;
    EditText hs1,hs2;
    TextView tongla,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bttinhtong);

        hs1=(EditText)findViewById(R.id.id1);
        hs2=(EditText)findViewById(R.id.id2);
        tongla=(TextView)findViewById(R.id.tong);
        btn=(Button)findViewById(R.id.btn);
        btn1=(Button)findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(hs1.getText().toString());
                int b=Integer.parseInt(hs2.getText().toString());
                int tongab=a+b;

                tongla.setText("Tổng là : " + tongab);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int a=Integer.parseInt(hs1.getText().toString());
                    int b=Integer.parseInt(hs2.getText().toString());
                    int hieuab=0;
                    if(a>b){
                        hieuab=a-b;
                    }else if(a<b){
                        hieuab=b-a;
                    }else{
                        hieuab=0;
                    }




                    textView2.setText("Hiệu là : " + hieuab);
                }catch (Exception e){

                }

            }
        });

    }

}
