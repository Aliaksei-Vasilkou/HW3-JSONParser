package com.github.coyclab.hw3_jsonparser.json;

import java.util.Date;

public interface IProduct {

    String getName();

    Double getPrice();

    int getDiscount();

    Date getFromDate();

    Date getToDate();
}