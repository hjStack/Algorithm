import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int array[]=new int[10];
        int count=0;

        for(int i=0; i<10; i++){
            int num=scanner.nextInt();
            array[i]=num%42;

            // 배열에 나머지를 저장하고 다른 값이 몇개 있는지 저장하려면
        }

        // 중복을 제거하고 서로 다른 값의 개수를 세야 하면
        for(int i=0; i<10; i++){
            boolean check=false; // 중복 체크
            for(int j=0; j<i; j++){
                if(array[i] == array[j]){
                    check=true;
                    break;
                }
            }

            if(!check){
                count++;
            }
        }


        System.out.println(count);
    }
}
