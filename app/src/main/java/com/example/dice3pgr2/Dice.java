package com.example.dice3pgr2;

import java.util.ArrayList;

public class Dice {
    private int value;
    private int idImage;
    private boolean isCliked;
    private ArrayList<Integer> allImage = new ArrayList<>();

    public Dice() {
        imageArray();
        this.value = (int)(Math.random()*6+1);
        this.isCliked = false;
        this.idImage = allImage.get(value-1);
    }

    private void imageArray(){
        allImage.add(R.drawable.dice_1);
        allImage.add(R.drawable.dice_2);
        allImage.add(R.drawable.dice_3);
        allImage.add(R.drawable.dice_4);
        allImage.add(R.drawable.dice_5);
        allImage.add(R.drawable.dice_6);
    }

    public int getValue() {
        return value;
    }

    public void setValue() {
        this.value = (int)(Math.random()*6+1);
        this.idImage = allImage.get(value-1);
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public boolean isCliked() {
        return isCliked;
    }

    public void setCliked(boolean cliked) {
        isCliked = cliked;
    }
}
