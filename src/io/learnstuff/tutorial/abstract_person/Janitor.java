package io.learnstuff.tutorial.abstract_person;

public class Janitor extends Person{

    private  String name;

    public Janitor(String name) {
        super(name);
    }

    @Override
    public void introduceYourself() {
        System.out.println("My name is " + name + ".");
    }

    @Override
    public void nameYourJob() {
        System.out.println("My job is to delete odd or even numbers from arrays.");
    }
   

    public void janitorMethod(int limitOfArray, String oddOrEven){
        int[] array = new int[limitOfArray];
        for (int i = 0; i <= limitOfArray - 1; i++) {
            array[i] = i;
        }
            
        switch (oddOrEven.toLowerCase()){
            case "odd":
                for(int i = 0; i < limitOfArray; i++){
                    if (array[i] % 2 == 0){
                        System.out.print(array[i] + " ");
                        }
                    }
                break;
            case "even":
                for(int i = 0; i < limitOfArray; i++){
                    if (array[i] % 2 != 0){
                        System.out.print(array[i] + " ");
                    }
                }
                break;
            default:
                throw new IllegalArgumentException("Choose only odd or even!");
            }

    }

    
}




