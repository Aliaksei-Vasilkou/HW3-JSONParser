package com.github.coyclab.hw3_jsonparser;

import com.github.coyclab.hw3_jsonparser.http.IHttpClient;
import com.github.coyclab.hw3_jsonparser.json.IProductList;
import com.github.coyclab.hw3_jsonparser.json.ProductListParserFactory;
import com.github.coyclab.hw3_jsonparser.mocks.Mocks;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;

import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Constants.SDK_VERSION)
public class ParserTest {

    public static final String HTTP_EXAMPLE_TEST_COM = "http://example-test.com";
    private IHttpClient mHttpClient;

    @Before
    public void setUp(){
        ShadowLog.stream = System.out;
        mHttpClient = mock(IHttpClient.class);
    }

    @Test
    public void parseJsonTest() throws Exception {
        final InputStream mockedInputStream = Mocks.stream(Constants.FILE_NAME);
        when(mHttpClient.request(anyString())).thenReturn(mockedInputStream);
        final InputStream response = mHttpClient.request(HTTP_EXAMPLE_TEST_COM);

        final ProductListParserFactory parserFactory = new ProductListParserFactory();
        final IProductList productList = parserFactory.createJsonParser(response).parse();

        assertTrue(productList.getProductList().size() == 4);
        assertEquals(productList.getProductList().get(1).getName(), "TV");
        assertEquals(productList.getProductList().get(3).getDiscount(), 15);
    }

    @Test
    public void parseGsonTest() throws Exception {
        final InputStream mockedInputStream = Mocks.stream(Constants.FILE_NAME);
        when(mHttpClient.request(anyString())).thenReturn(mockedInputStream);
        final InputStream response = mHttpClient.request(HTTP_EXAMPLE_TEST_COM);

        final ProductListParserFactory parserFactory = new ProductListParserFactory();
        final IProductList productList = parserFactory.createGsonParser(response).parse();

        assertTrue(productList.getProductList().size() == 4);
        assertEquals(productList.getProductList().get(1).getName(), "TV");
        assertEquals(productList.getProductList().get(3).getDiscount(), 15);
    }
}
