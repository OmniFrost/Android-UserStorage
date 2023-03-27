package com.example.userstorage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView txtUserName, txtDegreeProgram, txtEmail;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
        txtUserName = itemView.findViewById(R.id.txtUserName);
        txtDegreeProgram = itemView.findViewById(R.id.txtDegreeProgram);
        txtEmail = itemView.findViewById(R.id.txtEmail);


    }
}
