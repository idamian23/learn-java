package io.learnstuff.tutorial.UserClassJSONFile;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utils implements SerializationInterface {

    @Override
    public JSONObject serialize(User user) {
        JSONObject obj = new JSONObject();
        obj.put("name", user.getName());
        obj.put("email", user.getEmail());
        obj.put("age", user.getAge());
        obj.put("isWorking", user.getIsWorking());

        return obj;
    }

    @Override
    public User deserialize(JSONObject obj) throws ParseException {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(String.valueOf(obj));
        String name = (String) obj.get("name");

        String email = (String) obj.get("email");

        int age = (int) obj.get("age");

        boolean isWorking = (boolean) obj.get("isWorking");

        return new User(name, email, age, isWorking);
        }

    }

