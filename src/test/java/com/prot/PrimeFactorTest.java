/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prot;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Roberto Rodriguez :: <roberto.rodriguez@smartbt.com>
 */
@RunWith(value = Parameterized.class)
public class PrimeFactorTest {
    private Integer input;
    private Set expectedAnswer;

    public PrimeFactorTest( Integer input, Set expectedAnswer ) {
        this.input = input;
        this.expectedAnswer = expectedAnswer;
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> getTestParameters(){
      return Arrays.asList( new Object[][]{
          {12, new HashSet<Integer>(){ {add( 2 ); add( 3 );} }},
          {1492, new HashSet<Integer>(){ {add( 373 ); add( 2 );} }},
          {1000000, new HashSet<Integer>(){ {add( 2 ); add( 5 );} }}
      });
    }


    /**
     * Test of primeFactors method, of class PrimeFactor.
     * This test pretended to test the capability of the method of throw an IOException if a wrong path is given as input
     */
    @Test(expected = IOException.class)
    public void testPrimeFactors() throws Exception {
        System.out.println( "primeFactors" );
        PrimeFactor.primeFactors( "" );
    }

    /**
     * Test of getReader method, of class PrimeFactor.
     * This test pretended to test the capability of the method to create a valid BufferedReader if a valid path is given as input
     */
    @Test
    public void testGetReader() throws Exception {
        System.out.println( "getReader" );
        String path = "C:\\path\\b.txt";
        BufferedReader result = PrimeFactor.getReader( path );
        assertNotNull( result );
    }

    /**
     * Test of findPrimeFactors method, of class PrimeFactor.
     * This test pretended to test the capability of the method to return the right Set output for given Integer inputs
     */
    @Test
    public void testFindPrimeFactors() {
        System.out.println( "findPrimeFactors" );
      
        Set result = PrimeFactor.findPrimeFactors( input );
        assertEquals( expectedAnswer, result );
     
    }
    
}
