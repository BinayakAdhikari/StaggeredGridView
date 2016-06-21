package com.rent.blaze.staggeredgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private GridLayoutManager gridLayoutManager;
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.RecyclerItem);
        recyclerView.setHasFixedSize(true);

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(3,1);

        gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        List<ItemObjects> staggeredListContent = getListItem();

        SolventRecyclerViewAdapter rcAdapter = new SolventRecyclerViewAdapter(MainActivity.this, staggeredListContent);
        recyclerView.setAdapter(rcAdapter);
    }

    private List<ItemObjects> getListItem(){
        List<ItemObjects> listViewItems = new ArrayList<>();
        listViewItems.add(new ItemObjects("Alkane",R.drawable.one));
        listViewItems.add(new ItemObjects("Ethane",R.drawable.two));
        listViewItems.add(new ItemObjects("Alkyene",R.drawable.three));
        listViewItems.add(new ItemObjects("Benzene",R.drawable.four));


        return listViewItems;

    }
}
