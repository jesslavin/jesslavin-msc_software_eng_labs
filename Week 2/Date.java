// Define a Date class with the following methods:
public class Date {

    private int day;
    private int month;
    private int year;

    // A constructor that takes a day, a month and a year as integers.
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // A print method that takes a PrintStream as a parameter.
    public String print(){
        return String.format("%02d/%02d/%4d", this.day, this.month, this.year);
    }

    // Three methods, getDay, getMonth and getYear that return the integer day, month and year.
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }

    /* A method called diffInYears that takes a Date object as a parameter and returns the difference
    in years between the Date parameter and itself. This is an integer. */
    public int diffInYears(Date compareDate) {
        int yearCount = 0;
        if (compareDate.getMonth() < this.month) {
            yearCount =  compareDate.getYear() - this.year -1;
        } else if (compareDate.getMonth() > this.month) {
            yearCount = compareDate.getYear() - this.year;
        } else if (compareDate.getMonth() == this.month) {
            if (compareDate.getDay() < this.day) {
                yearCount = compareDate.getYear() - this.year -1;
            } else {
                yearCount = compareDate.getYear() - this.year;
            }
        }
        return yearCount;
    }
}