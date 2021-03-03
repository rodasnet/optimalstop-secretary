package com.rodasnet.optimalstop.secretary;

import java.util.*; 
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        List<Candidate> candies = Arrays.asList(
            new Candidate("Bob",1,1,1), 
            new Candidate("Alice",1,1,1), 
            new Candidate("Lisa",1,1,1),
            new Candidate("John",1,1,1),
            new Candidate("Ema",1,1,1),
            new Candidate("Chris",1,1,1),
            new Candidate("Nancy",1,1,1),
            new Candidate("Eric",1,1,1)
        );

        for (int i = 0; i < candies.size(); i++) {
            String message = "Hello, candidate " + candies.get(i).getName() + "!";
            System.out.println(message);
        }        
    }
}
