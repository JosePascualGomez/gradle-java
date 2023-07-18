package com.denofprogramming.random;

import org.apache.commons.math3.random.RandomDataGenerator;

public class MoreThan100RandomGenerator implements RandomGenerator {
    @Override
    public String name() {
        return "More than 100 ";
    }

    @Override
    public int generate() {
        final RandomDataGenerator aRandomDataGenerator = new RandomDataGenerator();
        return aRandomDataGenerator.nextInt(100, 199);
    }
}
