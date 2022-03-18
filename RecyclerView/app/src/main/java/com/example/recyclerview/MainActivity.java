package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.adapter.FoodAdapter;
import com.example.recyclerview.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Food> foodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recy);

        create();

        FoodAdapter foodAdapter = new FoodAdapter(this, foodList);
        recyclerView.setAdapter(foodAdapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(itemDecoration);

    }

    private void create(){
        foodList.add(new Food(R.drawable.pizza1, "Pizza", "Spicy Chiken Pizza", "RS 310.00"));
        foodList.add(new Food(R.drawable.burger1, "Burger", "Beef Bufher", "RS 350.00"));
        foodList.add(new Food(R.drawable.pizza2, "Pizza", "Chiken Pizza", "RS 250.00"));
        foodList.add(new Food(R.drawable.burger2, "Burger", "Chicken Burger", "RS 350.00"));
        foodList.add(new Food(R.drawable.mango, "Mango", "Mango juice", "RS 250.00"));
        foodList.add(new Food(R.drawable.pizza1, "Pizza", "Spicy Chiken Pizza", "RS 310.00"));
        foodList.add(new Food(R.drawable.burger1, "Burger", "Beef Bufher", "RS 350.00"));
        foodList.add(new Food(R.drawable.pizza2, "Pizza", "Chiken Pizza", "RS 250.00"));
        foodList.add(new Food(R.drawable.burger2, "Burger", "Chicken Burger", "RS 350.00"));
        foodList.add(new Food(R.drawable.mango, "Mango", "Mango juice", "RS 250.00"));
    }
}