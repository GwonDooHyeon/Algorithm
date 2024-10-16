import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        // 평균
        Arrays.stream(numbers).average().ifPresent(a -> System.out.println((int) a));
        // 중앙값
        Arrays.sort(numbers);
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println(numbers[i]);
                break;
            }
        }
    }
}
