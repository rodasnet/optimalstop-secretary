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
            new Candidate("Bob",7,6,6), 
            new Candidate("Alice",7,4,3), 
            new Candidate("Lisa",5,8,7),
            new Candidate("John",4,6,6),
            new Candidate("Ema",6,4,15),
            new Candidate("Chris",1,6,4),
            new Candidate("Nancy",3,4,5),
            new Candidate("James",1,3,4),
            new Candidate("Saly",8,1,5),
            new Candidate("Eric",9,4,6)
        );

        for (int i = 0; i < candies.size(); i++) {
            String message = "Hello, candidate " + candies.get(i).getName() + "!";
            System.out.println(message);
        }        
    }
}
