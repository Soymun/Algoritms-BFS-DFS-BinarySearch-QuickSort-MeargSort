package BinarySearch;

public class Main {


    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4,5,6};
        System.out.println(binarySearch(num, 1));
    }

    public static int binarySearch(int[] numbers,int target){
        int from = 0;
        int to = numbers.length;
        while (from < to){
            int mid = from + (to - from-1) / 2;
            if(numbers[mid] > target){
                to = --mid;
            } else if (numbers[mid] < target) {
                from = ++mid;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
