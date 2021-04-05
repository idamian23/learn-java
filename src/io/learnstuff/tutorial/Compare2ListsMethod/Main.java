package io.learnstuff.tutorial.Compare2ListsMethod;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] arg){
        List<String> list1 = Arrays.asList("a","b","c");
        List<String> list2 = Arrays.asList("c","b","a");
        var isEqual = CompareLists.isEqual(list1,list2);
        System.out.println(isEqual);
    }
}
