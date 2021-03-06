package com.whoelse.knilunchtime.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.math.BigDecimal;

public class Item implements Serializable {

    @SerializedName("item_id")
    public int itemId;
    public String name;
    public BigDecimal price;
    public String date;
    @SerializedName("image_url")
    public String image;
    public Order order;
    public Option[] options;

    public Supplier supplier;

    @Override
    public String toString() {
        return name;
    }
}
