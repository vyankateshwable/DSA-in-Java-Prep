public class mergeSortPractice {
//  nlogn
    public static void conquer(int arr[], int si, int mid, int ei){
        int merged [] = new int [ei-si +1];

        int startingIdx1 = si; 
        int startingIdx2 = mid+1;
        int mergedArrayIndex = 0;
        // O(n)
        while(startingIdx1 <= mid && startingIdx2 <= ei){
            if(arr[startingIdx1] < arr[startingIdx2]){
                merged[mergedArrayIndex++] = arr[startingIdx1++];
            }else{
                merged[mergedArrayIndex++] = arr[startingIdx2++];
            }
        }
        while(startingIdx1 <= mid){
            merged[mergedArrayIndex++] = arr[startingIdx1++];
        }
        while(startingIdx2 <= ei){
            merged[mergedArrayIndex++] = arr[startingIdx2++];
        }

        for(int i=0, j= si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    // O(logn)
    public static void divide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String args[]){
        int arr [] = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr,0,n-1);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
