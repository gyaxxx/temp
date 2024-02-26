package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contact> ContactList;
    private Adapter ListAdapter;
    private EditText etSearch;
    private ListView lstContact;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContactList = new ArrayList<>();
        ContactList.add
                (new Contact(1, "img1 ",
                "Pham Trong Tuan Nghia", "0911233183"));

        ContactList.add
                (new Contact(2, "img2",
                        "Dang Hong Nhung", "0903211453"));

        etSearch = findViewById(R.id.etSearch );
        lstContact = findViewById(R.id.lstContact);
        btnAdd = findViewById(R.id.btnAdd);

        ListAdapter = new Adapter(ContactList, this);
        lstContact.setAdapter(ListAdapter);
    }

}

