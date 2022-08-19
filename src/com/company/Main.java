package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Baked[] bakeds = {
                new Bread(),
                new Pie(),
                new Bun()
        };

        for (Baked a: bakeds) {
            a.method();
        }
    }
}
