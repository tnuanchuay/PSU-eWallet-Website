package models;

/**
 * Created by tnuanchuay on 4/9/2017.
 */
public class Hello {

    private int id;
    private String message;


    public Hello(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
