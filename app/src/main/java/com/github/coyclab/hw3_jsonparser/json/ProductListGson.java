package com.github.coyclab.hw3_jsonparser.json;

import com.google.gson.annotations.SerializedName;

import org.json.JSONException;

import java.util.LinkedList;
import java.util.List;

public class ProductListGson implements IProductList {

    @SerializedName("products")
    private List<ProductGson> mProductList;

    @SerializedName("backend_version")
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
