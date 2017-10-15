package com.github.coyclab.hw3_jsonparser.json;

import com.github.coyclab.hw3_jsonparser.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class ProductListParserFactory {

    public IParser createJsonParser(final InputStream pStream) throws IOException {
        return new ProductListJsonParser(IOUtils.toString(pStream));
    }

    public IParser createGsonParser(final InputStream pStream) throws IOException {
        return new ProductListGsonParser(pStream);
    }
}
