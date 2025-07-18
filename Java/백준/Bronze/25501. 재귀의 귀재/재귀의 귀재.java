import java.util.Scanner;

public class Main {
    static int result;

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        for(int i=0; i<num; i++){
            result = 0;
            System.out.println(isPalindrome(scanner.next()) + " " + result);
        }
    }

    // recursion 함수의 호출 횟수를 전역변수를 활용하여
    // 전역 변수 선언후 문자열을 입력하기 전에 0으로 초기화를 해준 후 recursion 함수의 첫줄에 1을 증가

    public static int recursion(String s, int l, int r){
        result++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
