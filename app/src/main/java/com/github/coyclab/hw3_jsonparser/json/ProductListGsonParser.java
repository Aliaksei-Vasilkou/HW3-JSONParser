package com.github.coyclab.hw3_jsonparser.json;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class ProductListGsonParser implements IParser {

    private final InputStream mInputStream;

    ProductListGsonParser(final InputStream pInputStream) {
        mInputStream = pInputStream;
    }

    @Override
    public IProductList parse() throws Exception {
        final Reader reader = new InputStreamReader(mInputStream);
        return new Gson().fromJson(reader, ProductListGson.class);
    }
}
