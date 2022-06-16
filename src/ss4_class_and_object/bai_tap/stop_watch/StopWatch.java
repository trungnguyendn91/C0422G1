package ss4_class_and_object.bai_tap.stop_watch;

import java.util.Arrays;
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        startTime = new Date();
    }

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
    public static void main(String[] args) {
        int[] arr = new int[10000];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        System.out.println("----- Array before sort -----");
        System.out.println(Arrays.toString(arr));
        StopWatch sw = new StopWatch();
        Arrays.sort(arr);
        System.out.println("----- Array after sort -----");
        System.out.println(Arrays.toString(arr));
        //selectionSort(arr);
        sw.stop();
        System.out.println("End time :" +sw.endTime.getTime());
        System.out.println("Start time :" + sw.startTime.getTime());
        System.out.printf("Elapsed Time : %d ms.\n", sw.getElapsedTime());
    }
}





