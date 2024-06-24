public class ArraysFunction {

    public static void update (int marks [], int Nonchangable) {
        Nonchangable = 10;
        for (int i=0; i<marks.length; i++) {
            marks [i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks [] = {97,98,99}; 
        int Nonchangable = 5;
        update(marks, Nonchangable);

        for (int i=0; i<marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println(Nonchangable);

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
    }
}
