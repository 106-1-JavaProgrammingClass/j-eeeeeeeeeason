import java.util.Scanner;

//id:106022312
//name:王奕盛
//date:20170930
//purpose:攝氏轉華氏溫度
public class ＨＷ２ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int C = scn.nextInt();
        System.out.println(Math.round(C*9/5f+32));
    }
}

