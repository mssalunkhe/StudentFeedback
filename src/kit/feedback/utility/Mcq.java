package kit.feedback.utility;

import java.util.HashMap;
import java.util.List;

public class Mcq extends Question{
    private HashMap<String, Float> options;
    private HashMap<String , Float> response;


    public Mcq(int id, String text, HashMap<String, Float> options, List<Float> weights) {
        super(id, text);
        this.options = options;
    }

    public HashMap<String,Float> getOptions() {
        return options;
    }


    public void setOptions(HashMap<String, Float> options) {
        this.options = options;
    }

    public HashMap<String, Float> getResponse() {
        return response;
    }

    public void setResponse(HashMap<String, Float> response) {
        this.response = response;
    }
}