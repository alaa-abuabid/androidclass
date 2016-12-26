package example.alaa.androidclass;

/**
 * Created by Alaa ab on 12/21/2016.
 */

public class OneClass {

    private int Number;
    private String Subject;

    public OneClass() {
    }

    public OneClass(int Number, String Subject) {
        this.Number = Number;
        this.Subject = Subject;
    }


    public void setNumber(int number) {
        Number = number;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public int getNumber() {
        return Number;
    }

    public String getSubject() {
        return Subject;
    }
}


