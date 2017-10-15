package com.github.coyclab.hw3_jsonparser.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

class ProductListJsonWrapper implements IProductList {

    private static final String PRODUCTS = "products";
    private static final String BACKEND_VERSION = "backend_version";
    private final JSONObject mProductList;

    ProductListJsonWrapper(final JSONObject pProductList) {
        mProductList = pProductList;
    }

    @Override
    public List<IProduct> getProductList() throws JSONException {
        final List<IProduct> temp = new ArrayList<>();
        final JSONArray productList = mProductList.getJSONArray(PRODUCTS);
        for (int i = 0; i < productList.length(); i++) {
            temp.add(new ProductJsonWrapper(productList.getJSONObject(i)));
        }
        return temp;
    }

    public int getBackendVersion() {
        return mProductList.optInt(BACKEND_VERSION);
    }
}
