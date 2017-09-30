import java.util.Scanner;

//id:106022312
//name:王奕盛
//date:20170930
//purpose:單位換算：⾝⾼及體重
public class HW5
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cm = scn.nextInt();
        int kg = scn.nextInt();

        System.out.println((double)cm/2.54);
        System.out.println((double)kg/0.454);


    }
}
