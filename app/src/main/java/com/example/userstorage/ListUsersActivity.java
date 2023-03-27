package com.example.userstorage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

public class ListUsersActivity extends AppCompatActivity {

    private UserStorage list;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_users);


        list = UserStorage.getInstance();
        recyclerView = findViewById(R.id.rvUserList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListAdapter(getApplicationContext(), list.getUsers()));


        for (User user : list.getUsers()) {
            Log.d("UserStorage", user.getFirstName() + " " + user.getLastName() + " " + user.getEmail() + " " + user.getDegreeProgram());
        }
    }



}
