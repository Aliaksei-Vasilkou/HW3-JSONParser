package com.github.coyclab.hw3_jsonparser.json;

import org.json.JSONObject;

import java.util.Date;

class ProductJsonWrapper implements IProduct {

    private static final String NAME = "name";
    private static final String PRICE = "price";
    private static final String DISCOUNT = "discount";
    private static final String FROMDATE = "fromdate";
    private static final String TODATE = "todate";

    private final JSONObject mJSONObject;

    ProductJsonWrapper(JSONObject pJSONObject) {
        mJSONObject = pJSONObject;
    }

    @Override
    public String getName() {
        return mJSONObject.optString(NAME);
    }

    @Override
    public Double getPrice() {
        return mJSONObject.optDouble(PRICE);
    }

    @Override
    public int getDiscount() {
        return mJSONObject.optInt(DISCOUNT);
    }

    @Override
    public Date getFromDate() {
        return new Date(mJSONObject.optLong(FROMDATE));
    }

    @Override
    public Date getToDate() {
        return new Date(mJSONObject.optLong(TODATE));
    }
}
