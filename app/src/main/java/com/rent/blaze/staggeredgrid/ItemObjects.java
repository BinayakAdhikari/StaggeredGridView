package com.rent.blaze.staggeredgrid;

/**
 * Created by blaze on 5/24/16.
 */
public class ItemObjects  {

    private String name;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public ItemObjects(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }
}
