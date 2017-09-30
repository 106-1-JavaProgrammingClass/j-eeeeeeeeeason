import java.util.Scanner;
//id:106022312
//name:王奕盛
//date:20170930
//purpose:英里轉公里
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        System.out.println((double)Math.round(v1*1.6f*10)/10f);
    }
}
