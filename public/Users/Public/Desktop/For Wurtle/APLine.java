public class APLine {
    private int a;
    private int b;
    private int c;

    public APLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope(){
        return -((double)a/b);
    }

    public boolean isOnLine(int x, int y){
        boolean val = false;
        int equation = (a*x) + (b * y) + c;
        if (equation == 0)
        val = true;
        return val;
    }
}
