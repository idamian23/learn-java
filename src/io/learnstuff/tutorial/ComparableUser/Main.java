package io.learnstuff.tutorial.ComparableUser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] arg){
        List<User> users = new ArrayList<>();
        users.add(new User("Vasile", "@email1.com"));
        users.add(new User("Ion", "@email2.com"));
        users.add(new User("Marcel", "@email3.com"));
        Collections.sort(users);
        System.out.println("Lista sortata dupa nume: " + users);
        Collections.sort(users, new EmailComparator());
        System.out.println("Lista sortata dupa adresa de email: " + users);
    }
}
