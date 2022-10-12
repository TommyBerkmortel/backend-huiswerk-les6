import java.util.ArrayList;
import java.util.List;

public class Person {
// variabelen

    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings;
    private List<Person> children;
    private List<Pet> pets;
    private List<Person> grandChildren = new ArrayList<>();

// constructor

    public Person() {
    }

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

// getters

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {return siblings;}

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public List<Person> getGrandChildren() {return grandChildren;}

// setters

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void setGrandChildren(List<Person> grandChildren) {
        this.grandChildren = grandChildren;
    }

    public void addParents(Person father, Person mother) {
        this.setMother(mother);
        this.setFather(father);
        mother.addChild(this);
        father.addChild(this);
    }

    public void addChild(Person child) {
        if (children == null) {
            children = new ArrayList<>();
            children.add(child);
        } else {
            children.add(child);
        }
    };

    public void addPet(Pet pet) {
        pet.setOwner(this);
        if (pets == null) {
            pets = new ArrayList<>();
            pets.add(pet);
        } else {
            pets.add(pet);
        }
    }

    public void addSibling(Person sibling) {
        if (siblings == null) {
            siblings = new ArrayList<>();
            siblings.add(sibling);
        } else {
            siblings.add(sibling);
        }
    }
}


