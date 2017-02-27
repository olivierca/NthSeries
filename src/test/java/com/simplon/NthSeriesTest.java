package com.simplon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthSeriesTest {

    @Test
    public void NthSeries_0()
    {
        //set
        NthSeries nth = new NthSeries();

        //test
        String result = nth.term(0);

        //assert
        assertEquals("0.00",result);
    }

    @Test
    public void NthSeries_1()
    {
        //set
        NthSeries nth = new NthSeries();

        //test
        String result = nth.term(1);

        //assert
        assertEquals("1.00",result);
    }

    @Test
    public void NthSeries_2()
    {
        //set
        NthSeries nth = new NthSeries();

        //test
        String result = nth.term(2);

        //assert
        assertEquals("1.25",result);
    }

    @Test
    public void NthSeries_5()
    {
        //set
        NthSeries nth = new NthSeries();

        //test
        String result = nth.term(5);

        //assert
        assertEquals("1.57",result);
    }
}
