package com.github.coyclab.hw3_jsonparser.json;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

class ProductGson implements IProduct {

    private static final String NAME = "name";
    private static final String PRICE = "price";
    private static final String DISCOUNT = "discount";
    private static final String FROMDATE = "fromdate";
    private static final String TODATE = "todate";

    @SerializedName(NAME)
    private String name;

    @SerializedName(PRICE)
    private Double price;

    @SerializedName(DISCOUNT)
    private int discount;

    @SerializedName(FROMDATE)
    private Long fromDate;

    @SerializedName(TODATE)
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
