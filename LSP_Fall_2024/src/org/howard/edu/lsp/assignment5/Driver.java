package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Value of Set1: " + set1.toString());
        try {
            System.out.println("Smallest value in Set1: " + set1.smallest());
            System.out.println("Largest value in Set1: " + set1.largest());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Value of Set2: " + set2.toString());

        System.out.println("Union of Set1 and Set2");
        set1.union(set2);
        System.out.println("Result of union: " + set1.toString());

        System.out.println("Intersection of Set1 and Set2");
        set1.intersect(set2);
        System.out.println("Result of intersection: " + set1.toString());
    }
}


