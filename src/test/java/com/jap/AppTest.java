package com.jap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {

        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {


        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }


    public void testFibonacciSeries() throws IllegalAccessException {
        int[] expected={0,1,1,2,3,5,8,13,21,34,55,89};
        int[] actual=App.fibonacciSeries(12);

        assertEquals(expected.length, actual.length);
        for(int i=0;i<expected.length;i++){
            assertEquals(expected[i],actual[i]);
        }
    }
}
