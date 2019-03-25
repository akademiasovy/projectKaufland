package sk.itsovy.main;

public class Globals {
    public static final int MAXITEMS;

    static {
        MAXITEMS = 7;
    }

    public void println(String message){
        System.out.println(message);
    }
    public void print(String message){
        System.out.print(message);
    }
}
