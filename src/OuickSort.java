public class OuickSort {
    public static void QuickSort(int[] arr,int low,int high){
        if (low<high){
            int pi=partition(arr,low,high);
            QuickSort(arr,low,pi-1);
            QuickSort(arr,pi+1,high);
        }
    }
    private static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=(low-1);
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void printArray(int[] arr){
        for(int j:arr)System.out.print(j +" ");
        System.out.println();
    }
    public static void Main(String[] args){
        int[] arr ={10,7,8,9,1,5};
        int n = arr.length;
        System.out.println("unsorted array:");
        printArray(arr);
        QuickSort(arr,0,n-1);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
