package com.usingjunit;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

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

    @Test
    public void testAdd(){
        App app = new App();
        int sum = app.sum( 2, 3 );
        assertEquals( 5, sum);
    }
    
    @Test(expected=Exception.class)
    public void testBun() {
        System.out.println( "testing BUN!!!" );
         App app = new App();
         app.bun();
         IllegalArgumentException a;
    }
}
