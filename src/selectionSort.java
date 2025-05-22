public class selectionSort {

    // 평균적으로 o(n^2)의 시간 복잡도를 가짐
    public static void selectionSort(int arr[]){

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={64,34,25,12,22,11,90};

        System.out.print("unsorted array : ");
        for(int value:arr){
            System.out.print(value + " ");
        }

        System.out.println(" ");

        selectionSort(arr);

        // 배열에서 최솟값을 찾아 정렬되지 않은 부분의 첫번째 원소와 교환

        System.out.print("sorted array : ");
        for(int value:arr){
            System.out.print(value + " ");
        }
    }
}
