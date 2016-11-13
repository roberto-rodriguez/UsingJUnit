/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.usingjunit;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class)
public class UsingParametersTest {
    private int expected;
    private int valueOne;
    private int valueTwo;

    public UsingParametersTest( int expected, int valueOne, int valueTwo ) {
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }
    
    @Parameters
    public static Collection<Object[]> getTestParameters(){
      return Arrays.asList( new Object[][]{
          {new Integer(15), new Integer(3), new Integer(5)}
          
      });
    }

    @Test
    public void testMultiply() {
        UsingParameters usingParameters = new UsingParameters();
        System.out.println( "** testing testMultiply() for : " + valueOne + ", " + valueTwo );
        assertEquals( expected, usingParameters.multiply( valueOne, valueTwo ) );
        
        
    }
    
}
