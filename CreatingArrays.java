import java.util.Scanner;

public class CreatingArrays {

    public static void createarrays (int n) {
        int marks [] = new int [n] ;

        Scanner sc = new Scanner(System.in);
        marks [0] = sc.nextInt();
        marks [1] = sc.nextInt();
        marks [2] = sc.nextInt();
        System.out.println("phy :" + marks[0]);
        System.out.println("chem :" + marks[1]);
        System.out.println("bio :" + marks[2]);
        sc.close();
        System.out.println(marks.length);
    }

    public static void main(String[] args) {
        createarrays(3);
    }
}