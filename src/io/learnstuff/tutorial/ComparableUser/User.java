package io.learnstuff.tutorial.ComparableUser;

public class User implements Comparable<User>{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(User other) {
        return name.compareTo(other.name);
    }
}
