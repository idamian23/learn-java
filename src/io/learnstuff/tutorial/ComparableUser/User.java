package io.learnstuff.tutorial.ComparableUser;

public class User implements Comparable<User>{
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }




    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(User other) {
        return name.compareTo(other.name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
