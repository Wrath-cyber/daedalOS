public class StudentAdvance extends Advance {

public StudentAdvance(int n){
super(n);
}

public double getPrice(){
    return super.getPrice()/2.0;
}

    public String toString() {
        return "Number: " + super.serialNumber + "\nPrice: " + getPrice() + "\n(student ID required)";
    }
}

 