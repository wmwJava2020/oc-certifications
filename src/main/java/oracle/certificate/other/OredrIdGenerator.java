package oracle.certificate.other;

import java.util.UUID;

public class OredrIdGenerator {

    public static String getIorderId(){
        String id = UUID.randomUUID().toString();
        return id.substring(14,18);
    }

    public static String getTimesDate(){
        Long time = System.currentTimeMillis();
        return time.toString().substring(4,10);
    }

    public static void main(String[] args) throws InterruptedException {
        String s = "-";
        for(int i = 0 ; i < 10 ;i++){
            Thread.sleep(100);
        System.out.println(getTimesDate() + "-"+ getIorderId());}

        int [] arr = {3,1,4,6,8,2,9,5,7};

        for(int i = 0 ; i < arr.length ; i++){
            int temp = 0;
            for(int j = i+ 1; j < arr.length; j++){
                if(arr[i] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
