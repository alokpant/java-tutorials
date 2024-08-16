import java.time.LocalDate;
import java.time.Period;

public class Worker {
    protected final String name;
    protected final String birthDate;
    protected final String endDate;

    protected static int employeeNo = 1;

    public static void main(String[] args) {
        SalariedEmployee emp = new SalariedEmployee(
                "Salaried Employee",
                "1980-03-05",
                "2024-10-12",
                90_000,
                false
        );

        System.out.println("Employee age is: " + emp.getAge());
        System.out.println("Salary is " + emp.collectPay());
        System.out.println(emp.toString());

        emp.retire();

        System.out.println("After retirement");
        System.out.println(emp.toString());
        System.out.println("______");

        SalariedEmployee retiredEmp = new SalariedEmployee(
                "Retired Salaried Employee",
                "1980-03-04",
                "2023-10-12",
                90_000,
                true
        );

        System.out.printf("Employee age is: %d", retiredEmp.getAge());
        System.out.printf("Salary is %f", retiredEmp.collectPay());
        System.out.println(retiredEmp.toString());
        System.out.println("______");

        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Hourly Pay worker",
                "1980-03-04",
                "2023-10-12",
                1213,
                50.10
        );

        System.out.printf("Employee age is: %d", hourlyEmployee.getAge());
        System.out.printf("Salary is %f", hourlyEmployee.collectPay());
        System.out.println(hourlyEmployee.toString());
        System.out.println("______");

        System.out.println("double Salary is " + hourlyEmployee.getDoublePay());
    }

    Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        LocalDate currentYear = LocalDate.now();
        return Period.between(LocalDate.parse(birthDate), currentYear).getYears();
    }
}

class Employee extends Worker {
    protected long employeeId;
    protected String hireDate;

    Employee(String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
        this.employeeId = Worker.employeeNo++;
        this.hireDate = endDate;
    }
}

class SalariedEmployee extends Employee {
    private final double annualSalary;
    private boolean isRetired;

    SalariedEmployee(String name, String birthDate, String endDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire() {
        isRetired = true;
    }

    public double collectPay() {
        return this.annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{\n" +
                "\tisRetired=" + isRetired +
                ",\n\temployeeId=" + employeeId +
                ",\n\thireDate='" + hireDate + '\'' +
                ",\n\tname='" + name + '\'' +
                ",\n\tbirthDate='" + birthDate + '\'' +
                ",\n\tendDate='" + endDate + '\'' +
                ",\n\tannualSalary=" + annualSalary +
                "\n} " + super.toString();
    }
}

class HourlyEmployee extends Employee {
    private final double hourlyPayRate;

    HourlyEmployee(String name, String birthDate, String endDate, long employeeId, double hourlyPayRate) {
        super(name, birthDate, endDate);
        this.employeeId = Worker.employeeNo++;
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay() {
        return hourlyPayRate * 2;
    }

    public double collectPay() {
        return this.hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
