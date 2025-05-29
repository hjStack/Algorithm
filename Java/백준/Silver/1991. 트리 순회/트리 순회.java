import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node{
    char value;
    Node left;
    Node right;

    // 생성시 매개변수를 받아 초기화하는 방법으로 선언 가능
    public Node(char value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}


public class Main{

    static Node[] tree;

    // 전위 순회 함수 선언
    public static void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    // 중위 순회 함수 선언
    public static void Inorder(Node node){
        if(node == null){
            return;
        }

        Inorder(node.left);
        System.out.print(node.value);
        Inorder(node.right);
    }

    // 후위 순회 함수 선언
    public static void postOrder(Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value);
    }

    public static void main(String[] args) throws IOException {

        // 전위 순회, 중위 순회, 후위 순회 알고리즘
        // 전위 : ROOT -> L -> R
        // 중위 : L -> ROOT -> R
        // 후위 : L -> R -> ROOT

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bufferedReader.readLine());

        // 노드 배열 생성
        tree = new Node[N + 1];

        for(int i=0; i<N; i++){
            StringTokenizer st=new StringTokenizer(bufferedReader.readLine());  // 띄어쓰기 기준
            char parentValue=st.nextToken().charAt(0);
            char leftValue=st.nextToken().charAt(0);
            char rightValue=st.nextToken().charAt(0);

            // Java에서 char 데이터 타입은 내부적으로 ASCII 코드를 사용

            // 부모 노드가 아직 생성되지 않은 경우
            if(tree[parentValue - 'A'] == null){
                tree[parentValue - 'A'] = new Node(parentValue);  // 부모 노드를 생성
            }

            // 왼쪽 자식이 존재할경우
            if(leftValue != '.'){
                tree[leftValue - 'A'] = new Node(leftValue);  // 왼쪽 자식 노드를 생성
                tree[parentValue - 'A'].left=tree[leftValue - 'A']; // 부모 노드와 연결
            }

            // 오른쪽 자식이 존재할경우
            if(rightValue != '.'){
                tree[rightValue - 'A'] = new Node(rightValue);
                tree[parentValue - 'A'].right=tree[rightValue - 'A'];
            }
        }


        // 전위 순회
        preOrder(tree[0]);
        System.out.println();

        // 중위 순회
        Inorder(tree[0]);
        System.out.println();

        // 후위 순회
        postOrder(tree[0]);
        System.out.println();

    }
}
