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
