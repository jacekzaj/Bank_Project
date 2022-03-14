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

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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