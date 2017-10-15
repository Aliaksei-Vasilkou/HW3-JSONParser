package com.github.coyclab.hw3_jsonparser.json;

import com.google.gson.annotations.SerializedName;

import org.json.JSONException;

import java.util.LinkedList;
import java.util.List;

class ProductListGson implements IProductList {

    private static final String PRODUCTS = "products";
    private static final String BACKEND_VERSION = "backend_version";

    @SerializedName(PRODUCTS)
    private List<ProductGson> mProductList;

    @SerializedName(BACKEND_VERSION)
    private int backendVersion;

    @Override
    public List<IProduct> getProductList() throws JSONException {
        final List<IProduct> temp = new LinkedList<>();
        for (final ProductGson item : mProductList) {
            temp.add(item);
        }
        return temp;
    }

    @Override
    public int getBackendVersion() {
        return backendVersion;
    }
}
