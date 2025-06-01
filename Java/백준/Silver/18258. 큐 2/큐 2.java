import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> q = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    q.add(Integer.parseInt(command[1]));
                    break;

                case "pop":
                    sb.append(q.isEmpty() ? -1 : q.poll()).append("\n");
                    break;

                case "size":
                    sb.append(q.size()).append("\n");
                    break;

                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "front":
                    sb.append(q.isEmpty() ? -1 : q.peek()).append("\n");
                    break;

                case "back":
                    sb.append(q.isEmpty() ? -1 : q.getLast()).append("\n");
                    break;
            }
        }

        System.out.print(sb); // 한 번만 출력
    }
}
