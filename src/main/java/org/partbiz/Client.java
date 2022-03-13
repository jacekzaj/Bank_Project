package org.partbiz;

public class Client {
    private String name;
    private String email;
    private double balans;

    public Client(String name, String email, double balans) {
        this.name = name;
        this.email = email;
        this.balans = balans;
    }


    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", balans=" + balans +
                '}';
    }
}