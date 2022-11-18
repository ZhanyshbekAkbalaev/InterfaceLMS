import person.ApartmentFamily;
import person.HostelFamily;
import person.HotelFamily;
import person.Person;
import rezdent.Apartment;
import rezdent.Hostel;
import rezdent.Hotel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * 1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат
         * 2. Квартирада жашагандар ком услуга толошот
         * 3. Общежитие менен гостиницада жашагандар аренда толошот
         * 4. Уй-булолор бир канча адамдан турушат
         * 5. Кайсы жерде канча адам жашаганын консольго чыгарыныз
         * 6. Жашоо демек озунун адресин корсотуу
         *
         *
         *
         * Hint: кыймыл аракеттерди интерфейс аркылуу реализация
         * кыласыздар,квартира бул класстар, уй було бул массив, адам бул класс.
         */
        Person[] people= {
                new ApartmentFamily("Janyshbekov",18,"kok jar",505),
                new ApartmentFamily("Janyshbek",20,"kok jar",504),
                new ApartmentFamily("Janyshbekova",19,"kok jar",502),
        };
        Person[] people1 = {
                new HostelFamily("Kubanov",13,"ala-too",500),
                new HostelFamily("Kubanova",29,"ala-too",501),
                new HostelFamily("Kuban",16,"ala-too",503),
        };
        Person[] people2 = {
                new HotelFamily("Myrzaev",28,"dordoi",1000),
                new HotelFamily("Myrzaeva",22,"dordoi",100),
                new HotelFamily("Myrza",28,"dordoi",5000),
        };


        Apartment apartment = new Apartment("kok jar", 10000, people);
        Hostel hostel = new Hostel("ala-too",20000,people1);
        Hotel hotel = new Hotel("dordoi",5000,people2);
while (true) {
    if (scanner.nextLine().equals(apartment.getAddress())) {
        System.out.println(apartment);
        for (Person per : people) {
            System.out.println(per);
        }
        apartment.arendaOblata();
    } else if (scanner.nextLine().equals(hostel.getAddress())) {
        System.out.println(hostel);
        for (Person person : people1) {
            System.out.println(person);
        }
        hostel.comunalkatoloo();
    } else if (scanner.nextLine().equals(hotel.getAddress())) {
        System.out.println(hotel);
        for (Person person : people2) {
            System.out.println(person);
        }
        hotel.comunalkatoloo();
    } else {
        System.out.println("Koi emi erkelebei oku" +
                "");
    }


}

















    }
}