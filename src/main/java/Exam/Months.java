package Exam;


 enum Months {
    January(30),
    February(28),
    March(31);

    public int days;

    Months(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public String getNumberOfDays(Months month) {
        switch(month) {
            case January:
                System.out.println("January has " + January.getDays() + " days.");
                break;
            case February:
                System.out.println("February has " + February.getDays() + " days.");
                break;
            case March:
                System.out.println("March has " + March.getDays() + " days.");
                break;
        }
        return "no value";
    }
}
