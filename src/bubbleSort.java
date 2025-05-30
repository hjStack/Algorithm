public class bubbleSort {

    public static void bubbleSort(int[] arr){
        for(int i=0; i < arr.length-1; i++){
            for(int j=0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[]={64,34,25,12,22,11,90};
        System.out.print("unsorted Array : ");

        for(int value:arr){
            System.out.print(value + " ");
        }

        System.out.println(" ");

        System.out.print("sorted Array : ");

        bubbleSort(arr);

        for(int value:arr){
            System.out.print(value + " ");
        }
    }
}
