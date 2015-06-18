package com.java.fileparser;

/**
 * Created by raunakshakya on 6/16/15.
 */
public class Member {

    private final static String DATA_SEPARATOR = ", ";

    String id;
    String firstName;
    String lastName;
    String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.id + DATA_SEPARATOR +
                this.firstName + DATA_SEPARATOR +
                this.lastName + DATA_SEPARATOR +
                this.address + System.getProperty("line.separator"); // "\r\n";
        /*
        The difference is not Java-specific, but platform specific.
        Historically carriage return is supposed to do about what the home button does: return the caret to the start
        of the line. \n is supposed to give you a new line but not move the caret.
            \n is for unix
            \r is for mac
            \r\n is for windows format
        */
    }
}
