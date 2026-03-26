package lesson_6;

public class TelephoneDirectory {
    private String telephone;
    private String lastName;

    public TelephoneDirectory(String telephone, String lastName) {
        this.telephone = telephone;
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Телефон: " + telephone + ", Фамилия: " + lastName;
    }
}
