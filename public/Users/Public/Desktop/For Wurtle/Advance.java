public class Advance extends Ticket {
    private int daysInAdvance;
    public Advance(int n) {
        super();
        setDaysInAdvance(n);
    }


    public double getPrice(){
        if (getDaysInAdvance() < 10)
        return 40;
        else
        return 30;
    }

    public int getDaysInAdvance() {
        return daysInAdvance;
    }

    public void setDaysInAdvance(int daysInAdvance) {
        this.daysInAdvance = daysInAdvance;
    }
}
