import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PersonTest {

    @Test
    void addChildTest() {
// arrange
        Person parent = new Person("Tommy", "van den", "Berkortel", "male", 32);
        Person eden = new Person("Eden", "van den", "Berkmortel", "male", 1);
        Person tey = new Person("Tey", "van den", "Berkmortel", "male", 0);

        List<Person> expected = new ArrayList<>();
        expected.add(eden);
        expected.add(tey);
// act
        parent.addChild(eden);
        parent.addChild(tey);
        List<Person> actual = parent.getChildren();
// assert
        assertEquals(expected, actual);
        assertEquals("Eden", parent.getChildren().get(0).getName());
        assertEquals("Tey", parent.getChildren().get(1).getName());
    }

    @Test
    void addParents() {
// arrange
        Person vader = new Person("Tommy", "van den", "Berkortel", "male", 32);
        Person zoon = new Person("Eden", "van den", "Berkmortel", "male", 1);
        Person moeder = new Person("Brenda", "van den", "Berkortel", "female", 30);

// act
        zoon.addParents(vader, moeder);

// assert
        assertEquals("Tommy", zoon.getFather().getName());
        assertEquals("Brenda", zoon.getMother().getName());
    }


    @Test
    void addPet() {
// arrange
        Person tommy = new Person("Tommy", "van den", "Berkortel", "male", 32);
        Pet boomer = new Pet("Boomer", 11, "hond");
        Pet billy = new Pet("Billy", 12, "kat");
        List<Pet> expected = new ArrayList<>();
        expected.add(boomer);
        expected.add(billy);

// act
        tommy.addPet(boomer);
        tommy.addPet(billy);
        List<Pet> actual = tommy.getPets();

// assert
        assertEquals(expected, actual);
        assertEquals("Tommy", boomer.getOwner().getName());
        assertEquals("Tommy", billy.getOwner().getName());
    }


    @Test
    void addSibling() {
        // arrange
        Person tommy = new Person("Tommy", "van den", "Berkortel", "male", 32);
        Person rene = new Person("Rene", "van den", "Berkortel", "male", 35);
        Person nepZus = new Person("Zus", "van den", "Berkortel", "female", 35);

        List<Person> expected = new ArrayList<>();
        expected.add(rene);
        expected.add(nepZus);

// act
        tommy.addSibling(rene);
        tommy.addSibling(nepZus);
        List<Person> actual = tommy.getSiblings();

// assert
        assertEquals(expected, actual);
        assertEquals("Rene", tommy.getSiblings().get(0).getName());
        assertEquals("Zus", tommy.getSiblings().get(1).getName());
    }
}