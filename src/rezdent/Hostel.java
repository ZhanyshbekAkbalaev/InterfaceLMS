package rezdent;

import person.Person;

public class Hostel extends Rezdent implements ComunalkaAble{
    public Hostel(String address, int money, Person[] people) {
        super(address, money, people);
    }

    @Override
    public void comunalkatoloo() {
        System.out.println("comunalkaga "+2000+"som toloit");
    }
}
