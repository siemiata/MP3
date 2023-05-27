public class Trainer extends Person{

    private int experienceYears;
    private String specialization;

    public Trainer(String name, String surname, int experienceYears, String specialization) {
        super(name, surname);
        this.experienceYears = experienceYears;
        this.specialization = specialization;
    }

    @Override
    public String hobby() {
        return "Motorbike";
    }
}
