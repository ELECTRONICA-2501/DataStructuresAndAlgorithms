class DynamicArray {

    // identify fields from problem statement

    private int[] arr;
    private int capacity;
    private int length;


    public DynamicArray(int capacity) {
        this.capacity = capacity; // assigns the value of parameter passed to the instance variable capacity
        this.length = 0;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {
        return arr[i];
        //return ith element
    }

    public void set(int i, int n) {
        arr[i] = n;
        //insert value at ith index
    }

    public void pushback(int n) {
        if(length == capacity){ //if the length and cap are equal, call resize to double capacity and copy old array into new array with new cap
            resize();
        }
        // since arr has more cap, set n element to the last position in array
        arr[length] = n;
        length++;
        // increase the length
    }

    public int popback() {
        //first check that array is not empty
       if(length == 0){
        throw new ArrayIndexOutOfBoundsException("Out dih bih");
       }
       //take the last element of array and set it to lastElement
       int lastElement = arr[length-1];
       length--;
       //decrement the length;
       return lastElement;
    
    }

    private void resize() {
        capacity = capacity*2; //increase capacity
        int[] newArr = new int[capacity]; // make a new array and initialize it to have the capacity that was increased
        //then copy old arr of fixed size and put it in new array of 2x capacity
        for(int i = 0; i < length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr; // declare the arr as the newArr.
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}

//Problem statement: Design a Dynamic Array (aka a resizable array) class, such as an ArrayList in Java or a vector in C++.
/*
Your DynamicArray class should support the following operations:

DynamicArray(int capacity) will initialize an empty array with a capacity of capacity, where capacity > 0.
int get(int i) will return the element at index i. Assume that index i is valid.
void set(int i, int n) will set the element at index i to n. Assume that index i is valid.
void pushback(int n) will push the element n to the end of the array.
int popback() will pop and return the element at the end of the array. Assume that the array is non-empty.
void resize() will double the capacity of the array.
int getSize() will return the number of elements in the array.
int getCapacity() will return the capacity of the array.
If we call void pushback(int n) but the array is full, we should resize the array first.

Example 1:

Input:
["Array", 1, "getSize", "getCapacity"]

Output:
[null, 0, 1]
Example 2:

Input:
["Array", 1, "pushback", 1, "getCapacity", "pushback", 2, "getCapacity"]

Output:
[null, null, 1, null, 2]
Example 3:

Input:
["Array", 1, "getSize", "getCapacity", "pushback", 1, "getSize", "getCapacity", "pushback", 2, "getSize", "getCapacity", "get", 1, "set", 1, 3, "get", 1, "popback", "getSize", "getCapacity"]

Output:
[null, 0, 1, null, 1, 1, null, 2, 2, 2, null, 3, 3, 1, 2]
Note:

The index i provided to get(int i) and set(int i) is guranteed to be greater than or equal to 0 and less than the number of elements in the array.
    */
