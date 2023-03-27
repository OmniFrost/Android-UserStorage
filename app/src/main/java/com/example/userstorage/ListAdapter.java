package com.example.userstorage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ViewHolder> {

    private Context context;

    private ArrayList<User> users = new ArrayList<>();


    public ListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.user_display, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String fullName = users.get(position).getFirstName() + " " + users.get(position).getLastName();
        holder.txtUserName.setText(fullName);
        holder.txtDegreeProgram.setText(users.get(position).getDegreeProgram());
        holder.txtEmail.setText(users.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
