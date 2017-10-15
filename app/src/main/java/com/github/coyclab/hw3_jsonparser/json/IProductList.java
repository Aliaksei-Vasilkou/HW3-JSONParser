package com.github.coyclab.hw3_jsonparser.json;

import org.json.JSONException;

import java.util.List;

public interface IProductList {

    public List<IProduct> getProductList() throws JSONException;

    public int getBackendVersion();
}
