package com.github.coyclab.hw3_jsonparser.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ProductListJsonWrapper implements IProductList {

    private final JSONObject mProductList;

    public ProductListJsonWrapper(JSONObject pProductList) {
        mProductList = pProductList;
    }

    @Override
    public List<IProduct> getProductList() throws JSONException {
        final List<IProduct> temp = new ArrayList<>();
        final JSONArray productList = mProductList.getJSONArray("products");
        for (int i = 0; i < productList.length(); i++) {
            temp.add(new ProductJsonWrapper(productList.getJSONObject(i)));
        }
        return temp;
    }
    public int getBackendVersion(){
        return mProductList.optInt("backend_version");
    }
}
