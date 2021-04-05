package io.learnstuff.tutorial.ComparableUser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] arg){
        List<User> users = new ArrayList<>();
        users.add(new User("Vasile"));
        users.add(new User("Ion"));
        users.add(new User("Marcel"));
        Collections.sort(users);
        System.out.println(users);
    }
}
