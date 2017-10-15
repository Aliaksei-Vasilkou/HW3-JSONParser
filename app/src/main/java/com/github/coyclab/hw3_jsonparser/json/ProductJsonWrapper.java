package com.github.coyclab.hw3_jsonparser.json;

import org.json.JSONObject;

import java.util.Date;

public class ProductJsonWrapper implements IProduct {

    private final JSONObject mJSONObject;

    public ProductJsonWrapper(JSONObject pJSONObject) {
        mJSONObject = pJSONObject;
    }

    @Override
    public String getName() {
        return mJSONObject.optString("name");
    }

    @Override
    public Double getPrice() {
        return mJSONObject.optDouble("price");
    }

    @Override
    public int getDiscount() {
        return mJSONObject.optInt("discount");
    }

    @Override
    public Date getFromDate() {
        return new Date(mJSONObject.optLong("fromdate"));
    }

    @Override
    public Date getToDate() {
        return new Date(mJSONObject.optLong("fromdate"));
    }
}
