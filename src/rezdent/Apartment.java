package rezdent;

import person.Person;

public class Apartment extends Rezdent implements ArendaAble{
    public Apartment(String address, int money, Person[] people) {
        super(address, money, people);
    }

    @Override
    public void arendaOblata() {
        System.out.println("arendaga "+1000+"som toloit");
    }
}
