package StopWatch;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.ceil(Math.random()*100000+1);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.setStartTime();
        for (int j = 0; j < array.length; j++) {
            for (int k = j+1; k < array.length; k++) {
                if (array[j]>array[k]){
                    int tempt;
                    tempt = array[j];
                    array[j] = array[k];
                    array[k] = tempt;
                }
            }
        }
        stopWatch.setEndTime();

        System.out.println("Thời gian bắt đầu xếp: " +stopWatch.getStartTime());
        System.out.println("Thời gian kết thúc xếp: " +stopWatch.getEndTime());
        System.out.println("Thời gian kết thúc xếp: " +stopWatch.getElapsedTime(stopWatch.getStartTime(), stopWatch.getEndTime()));
    }
}
