package org.huedev.lession01;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.huedev.lession01.models.Person;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Person> personList;

    public MyAdapter(List<Person> personList){
        this.personList = personList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(root);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Person p = personList.get(position);
        holder.tvName.setText(p.getName());
        holder.tvDesc.setText(p.getDesc());
    }

    @Override
    public int getItemCount() {
        return this.personList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView tvName;
        private TextView tvDesc;

        public MyViewHolder(View root) {
            super(root);
            imageView = root.findViewById(R.id.img);
            tvName = root.findViewById(R.id.name);
            tvDesc = root.findViewById(R.id.desc);
        }
    }
}
