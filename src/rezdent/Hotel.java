package rezdent;

import person.Person;

public class Hotel extends Rezdent implements ComunalkaAble{
    public Hotel(String address, int money, Person[] people) {
        super(address, money, people);
    }

    @Override
    public void comunalkatoloo() {
        System.out.println("Comunalkaga "+3000+"som toloit");
    }
}
