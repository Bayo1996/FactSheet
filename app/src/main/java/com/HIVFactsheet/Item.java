package com.HIVFactsheet;

/**
 * Created by Bayo on 4/22/2018.
 */

public  class Item {
    public final String text;
    public final int icon;
    Item(String text, Integer icon){
        this.text = text;
        this.icon = icon;
    }
    @Override
    public String toString() {
        return text;
    }
}
