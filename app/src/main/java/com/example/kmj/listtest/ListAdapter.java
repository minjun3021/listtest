package com.example.kmj.listtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter{
    ArrayList<Data> item=new ArrayList<>();

    public ListAdapter(ArrayList<Data> item) {
        this.item = item;
    }

    @Override
    public int getCount() {

        return item.size();
    }

    @Override
    public Object getItem(int i) {
        return item.get(i);
    }

  public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null);
        TextView big=v.findViewById(R.id.big);
        TextView small=v.findViewById(R.id.small);
        big.setText(item.get(i).big);
        small.setText(item.get(i).small);
        return v;
    }
}
