public class Employee {
    private final String firstname;
    private final String lastname;
    private final String socialSecurityNumber;

    public Employee(String firstname, String lastname, String socialSecurityNumber){
        this.firstname = firstname;
        this.lastname = lastname;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;

    }

    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n","Employee",getFirstname(),getLastname(),
                "socialSecurityNumber",getSocialSecurityNumber());
    }
}
