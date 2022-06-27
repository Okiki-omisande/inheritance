public class hourlyEmployeeTest {
    public static void main(String[] args) {
        hourlyEmployee employee = new hourlyEmployee("Okiki","Omisande","223345675",34.0,10);
        System.out.println(employee);

        System.out.println("Updated information\n");
        employee.setHours(20.0);
        employee.setWages(20.0);
        System.out.println(employee);
    }
}
