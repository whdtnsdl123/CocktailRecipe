package com.c282804.cocktailrecipe;

public class Item  {

    String name; //술 이름
    int iv;  //술 사진
    String imgURL; //술주소

    public Item(String name, int iv, String imgURL) {
        this.name = name;
        this.iv = iv;
        this.imgURL = imgURL;
    }
}
