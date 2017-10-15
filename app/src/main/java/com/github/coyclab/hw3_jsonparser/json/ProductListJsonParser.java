package com.github.coyclab.hw3_jsonparser.json;

import org.json.JSONObject;

class ProductListJsonParser implements IParser {

    private final String mSource;

    ProductListJsonParser(final String pSource) {
        mSource = pSource;
    }

    @Override
    public IProductList parse() throws Exception {
        final JSONObject jsonObject = new JSONObject(mSource);
        return new ProductListJsonWrapper(jsonObject);
    }
}
