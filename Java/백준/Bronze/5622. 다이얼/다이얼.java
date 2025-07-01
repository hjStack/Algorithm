import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word=br.readLine().toUpperCase();

        // 숫자 1을 걸려면 2초가 필요햠
        // 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며 한칸 옆에 있는 숫자를 걸기 위해서
        // 1초가 더 걸림

        // 어떤 단어를 걸때 알파벳에 해당하는 숫자를 걸면 됨
        HashMap<Character, Integer> dialMap = new HashMap<>();
        dialMap.put('A', 3); dialMap.put('B', 3); dialMap.put('C', 3);
        dialMap.put('D', 4); dialMap.put('E', 4); dialMap.put('F', 4);
        dialMap.put('G', 5); dialMap.put('H', 5); dialMap.put('I', 5);
        dialMap.put('J', 6); dialMap.put('K', 6); dialMap.put('L', 6);
        dialMap.put('M', 7); dialMap.put('N', 7); dialMap.put('O', 7);
        dialMap.put('P', 8); dialMap.put('Q', 8); dialMap.put('R', 8); dialMap.put('S', 8);
        dialMap.put('T', 9); dialMap.put('U', 9); dialMap.put('V', 9);
        dialMap.put('W', 10); dialMap.put('X', 10); dialMap.put('Y', 10); dialMap.put('Z', 10);

        int totalTime=0;
        for(int i=0; i<word.length(); i++){
            totalTime+= dialMap.get(word.charAt(i));
        }

        System.out.println(totalTime);

    }
}

