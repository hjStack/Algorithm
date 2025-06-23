import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        while(true){
            int a=scanner.nextInt();

            if(a == -1){
                break;
            }

            int sum=0;
            StringBuilder sb=new StringBuilder();
            sb.append(a).append(" = ");
            
            boolean first=true;

            for(int i=1; i<a; i++){
                if(a % i == 0){
                    sum += i;

                    if(!first){
                        sb.append(" + ");
                    }

                    sb.append(i);
                    first=false;
                }
            }

            if (sum == a) {
                System.out.println(sb.toString());
            }
            else{
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}
