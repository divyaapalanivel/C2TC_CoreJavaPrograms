package day11;

import java.util.*;

class practice implements Comparable<practice> {

    int marks;
    String name;

    practice(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    // Natural ordering based on marks
    public int compareTo(practice p) {
        return this.marks - p.marks;  // ascending order
    }

    public static void main(String[] args) {

        ArrayList<practice> list = new ArrayList<>();

        list.add(new practice(85, "Divya"));
        list.add(new practice(92, "Arun"));
        list.add(new practice(78, "Ajith"));

        Collections.sort(list);

        for (practice p : list) {
            System.out.println(p.marks + " " + p.name);
        }
    }
}
