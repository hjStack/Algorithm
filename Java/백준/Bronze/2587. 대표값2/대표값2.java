import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int solution(int array[]){
        Arrays.sort(array);
        return array[array.length/2];
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int array[]=new int[5];
        int sum=0;

        for(int i=0; i<array.length; i++){
            array[i]=scanner.nextInt();
            sum += array[i];
        }

        System.out.println(sum/5);

        // 중앙값
        // 주어진 수를 크기 순서대로 늘어놓았을때 가장 중앙에 놓인값

        System.out.println(solution(array));

    }
}
