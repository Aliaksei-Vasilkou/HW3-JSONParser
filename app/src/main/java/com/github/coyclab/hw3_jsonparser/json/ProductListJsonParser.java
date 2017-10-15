package com.github.coyclab.hw3_jsonparser.json;

import org.json.JSONObject;

public class ProductListJsonParser implements IParser {

    private final String mSource;

    public ProductListJsonParser(String pSource) {
        mSource = pSource;
    }

    @Override
    public IProductList parse() throws Exception {
        final JSONObject jsonObject = new JSONObject(mSource);
        return new ProductListJsonWrapper(jsonObject) ;
    }
}
