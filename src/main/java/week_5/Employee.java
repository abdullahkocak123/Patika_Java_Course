package week_5;

public class Employee {

    //Employee fields at outer class:
    private String name;
    private String surname;

    //Inner class and employee data (phone number and e-mail)
    static class ContactInfo {

        private String phoneNumber;
        private String mailAddress;

    }

    //Shows employee data in inner class
    void display() {
        Employee.ContactInfo contactInfo = new Employee.ContactInfo();
        System.out.println("Phone number: " + contactInfo.phoneNumber);
        System.out.println("Mail address: " + contactInfo.mailAddress);

    }
}
