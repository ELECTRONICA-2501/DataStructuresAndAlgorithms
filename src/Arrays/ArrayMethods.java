package Arrays;

public class ArrayMethods {

    public void traverseArray(int[] arr) {
        try{
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    public void searchInArray(int valueToSearch){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == valueToSearch){
                System.out.println("Value found at index: " + i);
                return;
            }
        }
    }
}
