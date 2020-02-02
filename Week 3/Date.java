public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String print(){
        return String.format("%02d/%02d/%4d", this.day, this.month, this.year);
    }

    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }

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