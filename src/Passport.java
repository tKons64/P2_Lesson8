import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private final String passportID;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate dateOfBirth;

    public Passport(String passportID, String lastName, String firstName, String middleName, LocalDate dateOfBirth) {
        this.passportID = passportID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportID.equals(passport.passportID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportID);
    }

    public void updateTheDataThisPassport(Passport newPassport) {
        this.lastName = newPassport.getLastName();
        this.firstName = newPassport.getFirstName();
        this.middleName = newPassport.getMiddleName();
        this.dateOfBirth = newPassport.getDateOfBirth();
    }
    public String getPassportID() {
        return passportID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Паспорт{" +
                "номер='" + passportID + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Имя='" + firstName + '\'' +
                ", Отчество='" + middleName + '\'' +
                ", дата рождения=" + dateOfBirth +
                '}';
    }
}
