package org.AppB;


import org.AppA.Work;

public class Main {
    public static void main(String[] args) {
        String aVal = new Work().getHi();
        System.out.println(aVal);
    }
}
