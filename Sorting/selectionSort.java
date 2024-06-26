class bubbleSort{

    public static void printArray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        
        // selectionSort
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            // select the smallest element in non sorted part if found update smallest index
            for(int j =i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            // Only one swap per iteration
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp; 
        }
        printArray(arr);

    }
}