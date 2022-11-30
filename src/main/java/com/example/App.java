package com.example;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        get("/helloworld", (req,res) -> "Hello World!" );
    }
}
