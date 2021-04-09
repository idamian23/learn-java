package io.learnstuff.tutorial.UserClassJSONFile;

import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] arg) throws ParseException {
        User user1 = new User("Pierre Hadot","prr.hdt@email.com",45,true);
        Utils utils = new Utils();
        System.out.println(utils.serialize(user1));
        System.out.println(utils.deserialize(utils.serialize(user1)).toString());

    }
}
