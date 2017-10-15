package com.github.coyclab.hw3_jsonparser.json;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class ProductGson implements IProduct {

    @SerializedName("name")
    private String name;

    @SerializedName("price")
    private Double price;

    @SerializedName("discount")
    private int discount;

    @SerializedName("fromdate")
    private Long fromDate;

    @SerializedName("todate")
    private Long toDate;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public int getDiscount() {
        return discount;
    }

    @Override
    public Date getFromDate() {
        return new Date(fromDate);
    }

    @Override
    public Date getToDate() {
        return new Date(toDate);
    }
}
