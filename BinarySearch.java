public class BinarySearch {

    

    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
       
        
        
        while (left < right) {
            int mid = Math.floorDiv(left + right, 2); // adding left + right, divides it and then if it is a decimal value floors it. 
            int midValue = arr[mid]; // uses the value from mid to find the middle value of the array. 

            if (target == midValue) {
                return mid; // The way the code is currently set up, this will execute on the third loop. 
            } else if(target > midValue) {
                left = mid + 1; // this will be completely skipped because of the way the code is currently set up. 
            } else {
                right = mid; // this will execute on the first and second iteration. 
            }
        }

        return -1;
    }   


    public static void main(String[] args) {
        
        BinarySearch first = new BinarySearch();
        int[] array = {1,2,3}; //  A linear search algorithm would be a better choice here since we have a small array and number 1 as the target.

        System.out.println(first.search(array, 1)); // passing in an array and a target value as an argument into the search method.

        
    }
}