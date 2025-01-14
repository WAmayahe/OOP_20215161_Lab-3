package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 88, 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 14.95f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 22.95f);

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.addDVD(dvd4);
        store.addDVD(dvd5);

        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Toy Story", "Animation", "John Lasseter", 81, 19.99f);
        store.addDVD(dvd6);

        store.removeDVD("Star Wars");

        store.removeDVD("Harry Potter");
    }
}
