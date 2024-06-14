public class LinearSearch {

    public static int linearsearch (int numbers [], int key) {
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            } 
        }
        return -1;
        }

    public static int linearsearchfood (String food [], String lock) {
        for (int i=0; i<food.length; i++) {
            if (food[i].equals(lock)) {
                return i;
            }
        }
        return -1;
        }

    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10,12,14,16};
        String food [] = {"mango","orange","apple","banana","strawberry"};
        String lock = "apple"; 
        int key = 10;

        int index = linearsearch(numbers,key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("key is at index : " + index);
        }

        int foodIndex = linearsearchfood(food, lock);
        if (foodIndex == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("lock is at index : " + foodIndex);
        }
    }
}
