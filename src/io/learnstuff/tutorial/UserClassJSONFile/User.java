package io.learnstuff.tutorial.UserClassJSONFile;

public class User  {


    private String name;
    private String email;
    private int age;
    private boolean isWorking;

    public User(String name, String email, int age, boolean isWorking) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isWorking = isWorking;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsWorking() {
        return isWorking;
    }

    @Override
    public String toString(){
        return "Name : " + this.name + " Email : " + this.email + " Age : " +  this.age+ " Is working : " + this.isWorking;
    }

}
