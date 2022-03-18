
public class GameSpinner {
    private int sectorNum;
    private int runs;
    private int prev;
    private boolean hasStart;
    private boolean hasEqual;
    public GameSpinner(int n) {
        this.sectorNum = n;
        this.runs = -69;
        this.hasStart = false;
        this.hasEqual = false;
    }

    public int currentRun(){
        if (!hasStart)
        this.runs =0;
        else if (hasStart && hasEqual) {
        this.runs++;}
        else if ( hasStart&& !hasEqual) {
        this.runs = 1;
        }
        return runs;
    }

    public int spin(){
        int n = (int)((Math.random()*sectorNum) +1);
        if(!hasStart) {this.hasStart = true;}
        if (prev == n) {
            this.hasEqual = true;
        } else if (prev!= n){
            this.hasEqual = false;
        }
        this.prev = n;
        return n;
    }

}
