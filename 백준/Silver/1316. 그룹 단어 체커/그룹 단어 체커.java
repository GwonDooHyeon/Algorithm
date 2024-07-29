import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 단어의 갯수
        int n = Integer.parseInt(br.readLine());

        // 그룹 단어 갯수
        int groupWordCount = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);

        br.close();
    }

    // 그룹단어인지를 확인하는 메소드
    public static boolean isGroupWord(String word) {
        // 체크
        boolean[] visited = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (visited[currentChar - 'a'] && (i > 0 && word.charAt(i - 1) != currentChar)) {
                return false;
            }
            visited[currentChar - 'a'] = true;
        }
        return true;
    }
}
