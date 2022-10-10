import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class PersonTest {

    @Test
    void addChild() {
// arrange
        Person parent = new Person("Tommy", "van den", "Berkortel", "male", 32);
        Person child = new Person("Eden", "van den", "Berkmortel", "male", 1);
        List<Person> children = new ArrayList<>();
        children.add(child);
// act
        parent.addChild(parent, child);
        List<Person> kids = parent.getChildren();
// assert
        assertEquals(children, kids);
        assertEquals("Eden", parent.getChildren().get(0).getName());
        assertEquals("van den", parent.getChildren().get(0).getMiddleName());
    }
}