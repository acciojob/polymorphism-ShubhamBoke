package com.driver;
import java.util.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    static class Product{
        public int product(int x, int y){
            return x*y;
        }

        public int product(int x, int y, int z){
            return x*y*z;
        }

        public double product(double x, double y){
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(2, 5));
        System.out.println(p.product(2, 5, 6));
        System.out.println(p.product(2.5, 5.7));
    }
}