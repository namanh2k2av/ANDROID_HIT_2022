package com.example.recyclerview.model;

public class Food {
    private int foodImg;
    private String foodType;
    private String foodName;
    private String foodPrice;

    public Food() {
    }

    public Food(int foodImg, String foodType, String foodName, String foodPrice) {
        this.foodImg = foodImg;
        this.foodType = foodType;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public int getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(int foodImg) {
        this.foodImg = foodImg;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }


}
