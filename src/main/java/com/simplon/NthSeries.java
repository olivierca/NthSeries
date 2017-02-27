package com.simplon;


import java.text.DecimalFormat;

public class NthSeries {
    private static final double step = 3f;
    double serie;
    double divide;
    String result;

    public String term(int parameter)
    {
        serie = 0f;
        divide = 1f;
        for (int i = 0; i < parameter; i++) {
            serie += 1/divide;
            divide += step;
        }
        return String.format("%.2f",serie).replaceFirst(",",".");
    }
}
