import java.util.EnumSet;

enum PersonType {Person, Owner, Trainer};
public abstract class Person {
    private String name;
    private String surname;
    private EnumSet<PersonType> persons =  EnumSet.of(PersonType.Person);

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract String hobby();
}
