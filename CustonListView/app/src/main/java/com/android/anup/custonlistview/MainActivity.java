package com.android.anup.custonlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView customlistView;
    String [] name = {"Ashish", "Anup", "Bensley", "Charlie", "David", "Emerson", "Francis", "George", "Peter", "Mathews", "Yadu", "Zack"};
    String [] number = {"9999999999", "8888888888", "7777777777", "6666666666", "5555555555", "4444444444", "3333333333", "2222222222", "1111111111", "1234567890", "9876543210", "5566447780"};
    List<Pojo> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        customlistView = (ListView)findViewById(R.id.Listview);
        for (int i=0; i<name.length; i++) {
            Pojo pojo = new Pojo();
            pojo.setName(name[i]);
            pojo.setNumber(number[i]);
            list.add(pojo);
        }

        CustomAdapter customAdapter  = new CustomAdapter(MainActivity.this, list);
        customlistView.setAdapter(customAdapter);
    }
}
