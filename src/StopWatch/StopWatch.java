package StopWatch;

public class StopWatch {
    private long startTime,endTime;


    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(long a,long b){
        a = this.startTime;
        b = this.endTime;
        return b-a;
    }


    public StopWatch(){

    }
}
