package com.example.recyclerview.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.model.Food;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    Context context;
    List<Food> foodList;

    public FoodAdapter(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.food_recy, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        Food food = foodList.get(position);
        holder.foodImg.setImageResource(food.getFoodImg());
        holder.foodType.setText(food.getFoodType());
        holder.foodName.setText(food.getFoodName());
        holder.foodPrice.setText(food.getFoodPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable viewColor = (ColorDrawable) holder.itemView.getBackground();
                if(viewColor.getColor() == Color.BLACK) {
                    holder.itemView.setBackgroundColor(Color.parseColor("#B57909"));
                    holder.foodName.setTextColor(Color.BLACK);
                } else {
                    holder.itemView.setBackgroundColor(Color.BLACK);
                    holder.foodName.setTextColor(Color.WHITE);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return foodList == null ? 0 : foodList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView foodImg;
        TextView foodType, foodName, foodPrice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImg = itemView.findViewById(R.id.food_img);
            foodType = itemView.findViewById(R.id.food_type);
            foodName = itemView.findViewById(R.id.food_name);
            foodPrice = itemView.findViewById(R.id.food_price);
        }
    }
}
