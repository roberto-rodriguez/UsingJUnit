/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prot;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Roberto Rodriguez :: <roberto.rodriguez@smartbt.com>
 */
public class PrimeFactor {

    public static void main( String[] args )throws IOException {

         primeFactors( "C:\\path\\b.txt" );
    }

    public static void primeFactors( String path ) throws IOException {
        BufferedReader reader = getReader( path );

        String str;

        while ( ( str = reader.readLine() ) != null ) {
            try {
                int number = Integer.parseInt( str );
                System.out.println( findPrimeFactors( number ) );

            } catch ( NumberFormatException nfe ) {
                System.out.println( "Invalid input: " + str + ".  Number expected." );
            }
        }
    }

    public static BufferedReader getReader( String path ) throws FileNotFoundException {
        FileReader reader = new FileReader( path );
        BufferedReader bufferedReader = new BufferedReader( reader );
        return bufferedReader;
    }

    public static Set findPrimeFactors( int n ) {
        Set set = new HashSet();
        for ( int i = 2; i <= n; i++ ) {
            if ( n % i == 0 ) {
                set.add( i );
                n /= i;
                i--;
            }
        }
        return set;
    }
    
}
