package sk.itsovy.main;

import sk.itsovy.exception.BillException;

public class Main {
    public static void main(String[] args) throws BillException {
        Application app = Application.getInstance();
        app.example();
    }
}
