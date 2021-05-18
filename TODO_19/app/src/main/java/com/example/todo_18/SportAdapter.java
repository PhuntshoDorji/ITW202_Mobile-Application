package com.example.todo_18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.ViewHolder> {
    private ArrayList<Sport> mSportsData;
    private Context mContex;
    private ImageView mSportImage;

    SportAdapter(Context contex, ArrayList<Sport>sportsDate){
        this.mSportsData= sportsDate;
        this.mContex=contex;
    }
    @NonNull
    @Override
    public SportAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContex).inflate(R.layout.list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SportAdapter.ViewHolder holder, int position) {
        Sport currentSport =mSportsData.get(position);
        holder.bindTo(currentSport);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mTitleText;
        private TextView mInfoText;

        ViewHolder(View itemview){
            super(itemview);

            mTitleText= (TextView)itemview.findViewById(R.id.title);
            mInfoText=(TextView)itemview.findViewById(R.id.subT);
            mSportImage= itemview.findViewById(R.id.sportsImage);
        }
        void bindTo(Sport currentSpot){
            mTitleText.setText(currentSpot.getTitle());
            mInfoText.setText(currentSpot.getInfo());
            Glide.with(mContex).load(currentSpot.getImageResources()).into(mSportImage);
        }

    }
}
