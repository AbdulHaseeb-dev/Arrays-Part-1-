public class SubArrays {

    public static void subarrays (int numbers []) {
        int ts = 0;
        for (int i=0; i<numbers.length; i++) {
            for (int j=i; j<numbers.length; j++) {
                for (int k=i; k<=j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the total number of sub arrays are : " + ts);
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10};
        subarrays(numbers);
    }
}
