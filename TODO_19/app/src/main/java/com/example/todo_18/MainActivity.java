package com.example.todo_18;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ArrayList<Sport> mSportData;
    RecyclerView mRecyclerView;
    SportAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int gridColumnCount= getResources().getInteger(R.integer.grid_column_count);

        mRecyclerView= (RecyclerView)findViewById(R.id.recyclerView);


        mRecyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

        mSportData =new ArrayList<>();

        SportAdapter mAdapter = new SportAdapter(this, mSportData);
        mRecyclerView.setAdapter(mAdapter);

        initializeData();
    }

    private void initializeData() {
        TypedArray sportsImageResources= getResources().obtainTypedArray(R.array.sports_image);
        String[] sportsList = getResources().getStringArray(R.array.Sports_title);
        String[] sportsInfo=getResources().getStringArray(R.array.Sports_info);
        mSportData.clear();

        for(int i=0; i<sportsList.length;i++){
            mSportData.add(new Sport(sportsList[i],sportsInfo[i], sportsImageResources.getResourceId(i, 0)));
        }
        mAdapter.notifyDataSetChanged();
        sportsImageResources.recycle();
    }
}