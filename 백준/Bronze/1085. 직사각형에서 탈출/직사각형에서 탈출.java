import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1085
// 직사각형에서 탈출
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int minX = 0;
        int minY = 0;

        // 위치 (x, y), 오른쪽 꼭짓점 (w, h)
        minX = Math.min(x, w - x);
        minY = Math.min(y, h - y);
        System.out.println(Math.min(minX, minY));



    }
}
