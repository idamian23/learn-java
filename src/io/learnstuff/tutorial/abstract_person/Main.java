package io.learnstuff.tutorial.abstract_person;

public class Main {
    public static void main(String[] args){

        var professor = new Professor("Gil Dobrică");
        var student = new Student("Damian Ionut");
        var janitor = new Janitor("John McCleaner");
        var securityGuard = new SecurityGuard("Spartacus");

        System.out.println("-----------PROFESSOR-------------");
        professor.getName();
        professor.introduceYourself();
        professor.nameYourJob();
        professor.professorMethod(11);

        System.out.println("-----------STUDENT-------------");
        student.introduceYourself();
        student.nameYourJob();
        student.studentMethod(1000);

        System.out.println();
        System.out.println("-----------JANITOR-------------");
        janitor.introduceYourself();
        janitor.nameYourJob();
        janitor.janitorMethod(10, "odd");

        System.out.println();
        System.out.println("-----------SEC GUARD-------------");
        securityGuard.securityGuardEncryptionMethod("password", 2);
        securityGuard.securityGuardDecryptionMethod("rcuuyqtf", 2);
    }
}
