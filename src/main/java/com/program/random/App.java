package com.program.random;

/**
 *
 * 
 */
public class App
{
    public static void main(String[] args)
    {
	    RandomGenerator aRandomGenerator = new MoreThan100RandomGenerator();
        System.out.println("Name Random :" + aRandomGenerator.name());
	    System.out.println("The number is :" + aRandomGenerator.generate());
    }
}
