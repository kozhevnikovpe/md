package com.pavelekozhevnikov.homework;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Hw6Adapter extends RecyclerView.Adapter<Hw6Adapter.ViewHolder>{
        private List<Product> list;

    public Hw6Adapter(List<Product> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hw6_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder myViewHolder, int position) {
        myViewHolder.bind(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewTitle;
        private TextView textViewPrice;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.text_title);
            textViewPrice = itemView.findViewById(R.id.text_price);
            imageView = itemView.findViewById(R.id.image_view);
        }

        public void bind(int position) {
            textViewTitle.setText(list.get(position).name);
            textViewPrice.setText(String.valueOf(list.get(position).price)+" руб");
            switch (position % 4){
                case 0:
                    imageView.setImageResource(R.drawable.tomato);
                    break;
                case 1:
                    imageView.setImageResource(R.drawable.strawberry);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.grape);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.raspberries);
                    break;
            }

        }
    }
}
