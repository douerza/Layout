package com.example.douzaer.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1,bt2,bt3; //跳转布局三个按钮
        bt1 = (Button) findViewById(R.id.Button01);
        bt2 = (Button) findViewById(R.id.Button02);
        bt3 = (Button) findViewById(R.id.Button03);
        //跳转线性布局按钮
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,LinearLayoutActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        //跳转相对布局按钮
        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,RelativeLayoutAcitivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        //跳转表格布局按钮
        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,TableLayoutAcitivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

}



