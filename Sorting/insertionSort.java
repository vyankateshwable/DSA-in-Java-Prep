class insertionSort{

    public static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        
        // insetionSort
        // Divide array in two parts sorted and unsorted part 
        // We will consider first element of array in sorted part and start the loop from array index 1
        for(int i=1; i < arr.length; i++){ 
           int current = arr[i]; //Store the current element to compare it first with last elemnt of sorted part  
           int j = i-1; // pointer for sorted part
           while(j>=0 && current < arr[j]){
            arr[j+1] = arr[j];
            j--;
           }

        //    placement
        arr[j+1] = current ;
            
        }
        printArray(arr);

    }
}