package Week_2;

public class Employee {

    //Defining properties;
    String nameSurname;
    private double salary;
    private int workHours;
    private int hireYear;

    //Constructor method;
    public Employee(String nameSurname, double salary, int workHours, int hireYear) {
        this.nameSurname = nameSurname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Tax mathod
    public double tax() {
        double tax;
        if (salary < 1000) {
            tax = 0;
        } else {
            tax = salary * 0.03;
        }
        return tax;
    }

    //bonus for overtime method
    public double bonus() {
        double bonus;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        } else {
            bonus = 0;
        }
        return bonus;
    }

    //Method for increase salary according to hireYear
    public double raiseSalary() {
        double raiseSalary;
        if (2021 - hireYear < 10) {
            raiseSalary = salary * 0.05;
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            raiseSalary = salary * 0.1;
        } else {
            raiseSalary = salary * 0.15;
        }
        return raiseSalary;
    }

    //Print info for employee
    public String toString() {
        return "Adı : " + nameSurname + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (salary - tax() + bonus()) + "\n" +
                "Toplam Maaş : " + (salary - tax() + bonus() + raiseSalary())
                ;
    }
}
