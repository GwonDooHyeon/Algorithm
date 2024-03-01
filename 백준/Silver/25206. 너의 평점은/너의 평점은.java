import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 과목
    private static final String[] GRADE = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
    // 과목 평점
    private static final double[] GRADE_SCORE = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 학점의 총합
        double gradeScoreSum = 0;
        // 전공평점
        double totalSum = 0;

        double answer = 0;

        // 입력 : 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 과목명 쓸모 x
            String object = st.nextToken();
            // 학점
            double gradeScore = Double.parseDouble(st.nextToken());
            // 등급
            String grade = st.nextToken();

            // P인 과목은 계산에서 제외
            if (!grade.equals("P")) {
                gradeScoreSum += gradeScore;
                for (int j = 0; j < GRADE.length; j++) {
                    if (grade.equals(GRADE[j])) {
                        totalSum += gradeScore * GRADE_SCORE[j];
                    }
                }
            }
        }

        answer = totalSum / gradeScoreSum;
        System.out.printf("%6f", answer);

        br.close();
    }
}
