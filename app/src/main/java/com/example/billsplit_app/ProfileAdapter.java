package com.example.billsplit_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>{

    private Context context;
    private ArrayList<User> userList;

    public ProfileAdapter(@NonNull Context context, @NonNull ArrayList<User> userList){
        this.context = context;
        this.userList = userList;
    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder{
        private TextView name_str;
        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            name_str = itemView.findViewById(R.id.user_name);
        }
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_profile, parent,false);
        return new ProfileViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        String name = userList.get(position).getUsername();
        holder.name_str.setText(name);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}