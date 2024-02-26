package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter implements Filterable {

    public void setData(ArrayList<Contact> data) {
        this.data = data;
    }

    private ArrayList<Contact> data;
    private ArrayList<Contact> databackup;
    private Activity context;
    private LayoutInflater inflater;

    public Adapter(ArrayList<Contact> data, Activity activity) {
        this.data = data;
        this.context = activity;
        this.inflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return data.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if(v == null)
            v = inflater.inflate(R.layout.contactitem, null);
            ImageView imgprofile = v.findViewById(R.id.Avatar);
        TextView name = v.findViewById(R.id.Name);
        name.setText(data.get(i).getName());
        TextView phonenumber = v.findViewById(R.id.PhoneNumber);
        phonenumber.setText(data.get(i).getPhone());
        return v;
    }

    @Override
    public Filter getFilter() {
        return null;
    }
}
