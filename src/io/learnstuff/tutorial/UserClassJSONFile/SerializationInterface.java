package io.learnstuff.tutorial.UserClassJSONFile;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public interface SerializationInterface {
    public JSONObject serialize(User  user);
    public User deserialize(JSONObject obj) throws ParseException;
}
