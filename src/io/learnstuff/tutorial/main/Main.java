package io.learnstuff.tutorial.main;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();
        int[] arr = {1, 2, 3, 4, 2, 2, 2, 2};
        System.out.println(counter.count(arr, 2));
        String[] arrString = {"abc", "asfasd", null};
        System.out.println(counter.count(arrString, "abc"));
    }

}

