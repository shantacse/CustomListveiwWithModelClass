package com.example.shantacse.customlistveiwwithmodelclass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {


    Context context;
    LayoutInflater inflater;
    List<AndroidPOJO> mylist;

    public CustomAdapter(Context context, List<AndroidPOJO> mylist) {
        this.context = context;
        this.mylist = mylist;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mylist.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();
        convertView=inflater.inflate(R.layout.list_veiw_item,parent,false);
        holder.version=convertView.findViewById(R.id.Version);
        holder.name=convertView.findViewById(R.id.androidName);
        holder.release=convertView.findViewById(R.id.release);


        holder.version.setText(mylist.get(position).getVersion());
        holder.name.setText(mylist.get(position).getName());
        holder.release.setText(mylist.get(position).getRelease()
        );

        return convertView;
    }

    public class Holder{

        TextView version,name,release;



    }

}






