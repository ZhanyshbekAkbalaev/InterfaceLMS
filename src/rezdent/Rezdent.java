package rezdent;

import person.Person;

import java.util.Arrays;

public abstract class Rezdent {
    private String address;
    private int money;
    private Person[] people;

    public Rezdent(String address, int money, Person[] people) {
        this.address = address;
        this.money = money;
        this.people = people;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Rezdent{" +
                "address='" + address + '\'' +
                ", money=" + money +
                '}';
    }
}
