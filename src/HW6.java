import java.util.Scanner;

//id:106022312
//name:王奕盛
//date:20170930
//purpose:字串切割
public class HW6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "Jack#David&John#Kevin";
        char ch = '#';
        System.out.println(str.replace(ch,'\n'));
    }
}