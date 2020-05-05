package org.huedev.lession01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.huedev.lession01.models.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(getPersonList());
        recyclerView.setAdapter(mAdapter);
    }

    private List<Person> getPersonList(){
        List<Person> personList = new ArrayList<>();
        for (int i= 0; i<20; i++){
            Person p = new Person("", "Person " + i, "Desc " + i);
            personList.add(p);
        }
        return personList;
    }
}
