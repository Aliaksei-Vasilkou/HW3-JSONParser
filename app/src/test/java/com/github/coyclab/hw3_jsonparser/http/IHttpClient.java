package com.github.coyclab.hw3_jsonparser.http;

import java.io.InputStream;

public interface IHttpClient {
    InputStream request(String url);
}
