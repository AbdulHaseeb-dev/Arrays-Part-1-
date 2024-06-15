public class LargestinArray {

    public static int largestnumber (int numbers []) {
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10,12,14};
        System.out.println("the largest numberr is : " + largestnumber(numbers));
    }
}
