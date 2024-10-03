import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수학은 비대면강의입니다
// https://www.acmicpc.net/problem/19532
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // x1
        int b = Integer.parseInt(st.nextToken()); // y1
        int c = Integer.parseInt(st.nextToken()); //

        int d = Integer.parseInt(st.nextToken()); // x2
        int e = Integer.parseInt(st.nextToken()); // y2
        int f = Integer.parseInt(st.nextToken());

        int x = (c * e - b * f) / (a * e - b * d);
        int y = (c * d - a * f) / (b * d - a * e);

        System.out.println(x + " " + y);
    }
}
