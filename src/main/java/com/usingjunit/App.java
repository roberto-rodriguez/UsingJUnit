package com.usingjunit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       new App().bun();
    }
    
    public int sum(int a , int b){
        return a + b;
    }
    
    public void bun() throws RuntimeException {
        throw new RuntimeException("BUN!!!");
    }
}
