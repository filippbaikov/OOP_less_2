package VetClinic;

public class Doctor extends Employees{


    private Nurse nurse;

    public Doctor(String name, String surname, float salary, String specialization, Nurse nurse) {
        super(name, surname, salary, specialization);
        this.nurse = nurse;
    }
    public Doctor(String name, String surname, float salary, String specialization) {
        super(name, surname, salary, specialization);
        this.nurse =null;
    }


}
