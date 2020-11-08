package org.techtown.moti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    mainfragment mainfragment;
    localfragment localfragment;
    schoolfragment schoolfragment;

    Button button1;
    Button button2;
    Button button3;
    Button button4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mainfragment = (mainfragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        localfragment = new localfragment();
        schoolfragment = new schoolfragment();

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFragmentchaged(1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFragmentchaged(2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFragmentchaged(3);
            }
        });

//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onFragmentchaged(4);
//            }
//        });
    }

    public void onFragmentchaged(int idx){
        if(idx == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,mainfragment).commit();
        }
        else if(idx == 2){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,schoolfragment).commit();
        }

        else if(idx == 3){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,localfragment).commit();
        }

//        else if(idx == 2){
//            getSupportFragmentManager().beginTransaction().replace(R.id.container,mainFragment).commit();
//        }
    }

}
