public class AdditionPattern{
    private int currentNumber;
    private int patternNumber;
    private int c;
    public AdditionPattern(int n, int x){
        this.currentNumber = n;
        this.patternNumber = x;
        this.c = 0;
    }

    public int currentNumber(){
        return currentNumber;
    }

    public void next(){
        this.currentNumber += patternNumber;
        c++;
    }
    public void prev(){
        if(c!=0){
        this.currentNumber -= patternNumber;
        c--;
        }
    }
}