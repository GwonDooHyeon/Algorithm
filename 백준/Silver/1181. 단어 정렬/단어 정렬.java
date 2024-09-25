import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 단어 정렬
// https://www.acmicpc.net/problem/1181
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String[] words = new String[count];
        for (int i = 0; i < count; i++) {
            words[i] = br.readLine();
        }

        Arrays.stream(words)
                .distinct()
                .sorted(Comparator.comparingInt(String::length).thenComparing(String::compareTo))
                .forEach(System.out::println);
    }

}
