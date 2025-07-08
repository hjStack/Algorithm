import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        
        StringBuilder sb=new StringBuilder();
        int N=scanner.nextInt();

        // list 계열중 하나를 쓰면 된다
        // ArrayList 에 모든 원소를 입력받아 저장하고 Collections 패키지에 있는 sort()를 사용하여 정렬한다 
        
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0; i<N; i++){
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

        for(int value:list){
            sb.append(value).append('\n');
        }

        System.out.println(sb);

    }
}
