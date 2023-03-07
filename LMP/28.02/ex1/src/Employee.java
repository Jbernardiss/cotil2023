

public class Employee {
    private String name, surname;
    private double monthlyWage;

    public Employee() {
        this.name = "";
        this.surname = "";
        this.monthlyWage = 0;
    }

    public Employee(String name, String surname, double monthlyWage) {
        this.name = name;
        this.surname = surname;
        if(monthlyWage >= 0) {
            this.monthlyWage = monthlyWage;
        } else {
            this.monthlyWage = 0;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getMonthlyWage() {
        return monthlyWage;
    }

    public double getYearlyWage() {
        return monthlyWage * 12;
    }

    public void setMonthlyWage(double monthlyWage) {
        if(monthlyWage >= 0) {
            this.monthlyWage = monthlyWage;
        } else {
            this.monthlyWage = 0;
        }
    }
}
