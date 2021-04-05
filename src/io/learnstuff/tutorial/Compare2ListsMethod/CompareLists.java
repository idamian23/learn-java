package io.learnstuff.tutorial.Compare2ListsMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareLists {
    public static <T extends Comparable<T>> boolean isEqual(List<T>list1, List<T> list2){
        //Lists are both null
        if(list1 == null && list2 == null)
            return true;
        else if(list1 == null || list2 == null)
            return false;

        else if(list1.size() != list2.size())
            return false;

        list1 = new ArrayList<T>(list1);
        list2 = new ArrayList<T>(list2);

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }
}
