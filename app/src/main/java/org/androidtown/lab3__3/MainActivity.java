package org.androidtown.lab3__3;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    public Button btn_frag1;
    public Button btn_frag2;

    //DECLARE
    FirstFragment tab1;
    SecondFragment tab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        setListener();
    }

    public void init() {
        btn_frag1 = (Button) findViewById(R.id.btn_frag1);
        btn_frag2 = (Button) findViewById(R.id.btn_frag2);

        //CREATE FRAGMENT CLASS
        tab1 = new FirstFragment();
        tab2 = new SecondFragment();
    }

    private void setListener() {

        btn_frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //VIEW FIRST FRAGMENT
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_for_fragment, tab1).commit();

            }
        });

        btn_frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //VIEW SECOND FRAGMENT
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_for_fragment, tab2).commit();

            }
        });
    }

}
