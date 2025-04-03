package week_5;

//Generating enum of Day
public enum Day {
    MONDAY("9:00 - 17:00"),
    TUESDAY("9:00 - 17:00"),
    WEDNESDAY("9:00 - 17:00"),
    THURSDAY("9:00 - 17:00"),
    FRIDAY("9:00 - 17:00"),
    SATURDAY("Free day"),
    SUNDAY("Free day");

    private final String workHours; //to define workhours of days

    Day(String workHours) { //Constructor with parameter of working hours
        this.workHours = workHours;
    }

    public String getWorkHours() { // Method to get working hours of days
        return workHours;
    }

}
