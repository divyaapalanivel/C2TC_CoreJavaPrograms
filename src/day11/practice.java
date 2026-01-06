package day11;

import java.util.*;

class practice implements Comparable<practice> {

    int marks;
    String name;

    practice(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    
    public int compareTo(practice p) {
        return this.marks - p.marks; 
    }

    public static void main(String[] args) {

        
        // Comparison (simple if-else)
        
        int a = 50;
        int b = 75;

        System.out.println("=== Comparison Example ===");
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " and " + b + " are equal");
        }

        
        // Comparable (sorting objects)
        
        ArrayList<practice> list = new ArrayList<>();
        list.add(new practice(85, "Divya"));
        list.add(new practice(92, "Arun"));
        list.add(new practice(78, "Ajith"));

        Collections.sort(list);

        System.out.println("\n=== Comparable Example (Sorted by marks) ===");
        for (practice p : list) {
            System.out.println(p.marks + " " + p.name);
        }
    }
}
