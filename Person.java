import java.util.EnumSet;
import java.util.Optional;

enum PersonType {Person, Owner, Trainer};
public abstract class Person {
    private String name;
    private String surname;
    private String gender;
    private Optional<String> maidenName;
    private Optional<String> militaryService;
    private EnumSet<PersonType> persons =  EnumSet.of(PersonType.Person);

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, String gender, Optional<String> maidenName, Optional<String> militaryService, EnumSet<PersonType> persons) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.maidenName = maidenName;
        this.militaryService = militaryService;
        this.persons = persons;
    }

    public abstract String hobby();
}
