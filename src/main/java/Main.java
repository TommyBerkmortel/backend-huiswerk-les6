public class Main {
    public static void main(String[] args) {
        Person tommy = new Person("Tommy", "van den", "Berkortel", "male", 32);
        Person moeder = new Person("mama", "van den", "Berkmortel", "female", 55);
        Person vader = new Person("papa", "van den", "Berkmortel", "male", 55);
        Person eden = new Person("Eden", "van den", "Berkortel", "male", 1);
        Person tey = new Person("Tey", "van den", "Berkortel", "male", 0);
        Person rene = new Person("Rene", "van den", "Berkortel", "male", 35);
        Person kleinkind = new Person("Kleindochter", "van den", "Berkmortel", "female", -20);

        Pet boomer = new Pet("Boomer", 11, "hond");
        Pet billy = new Pet("Billy", 12, "kat");
        Pet elvis = new Pet("Elvis", 0, "vis");

        tommy.addParents(vader, moeder);

        tommy.addChild(eden);
        tommy.addChild(tey);
        eden.addChild(kleinkind);

        tommy.addPet(boomer);
        tommy.addPet(billy);
        tey.addPet(elvis);

        tommy.addSibling(rene);
    }
}
