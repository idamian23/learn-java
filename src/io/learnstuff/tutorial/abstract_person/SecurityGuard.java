package io.learnstuff.tutorial.abstract_person;

public class SecurityGuard extends Person{

    private  String name;

    public SecurityGuard(String name) {
        super(name);
    }

    @Override
    public void introduceYourself() {
        System.out.println("My name is " + name + ".");
    }

    @Override
    public void nameYourJob() {
        System.out.println("My job is to keep your data safe.");
    }

    public void securityGuardEncryptionMethod(String textToEncrypt, int key){
        char[] chars = textToEncrypt.toCharArray();
        for(char c : chars){
            c += key; // char and int works togheter
            System.out.print(c);
        }
        System.out.println("\n");
    }
    public void securityGuardDecryptionMethod(String textToDecrypt, int key){

        char[] chars = textToDecrypt.toCharArray();
        for(char c : chars){
            c -= key;
            System.out.print(c);

        }

    }
}
