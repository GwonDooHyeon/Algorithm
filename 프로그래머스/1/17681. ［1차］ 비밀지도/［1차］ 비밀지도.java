class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 1. 10진수를 2진수로 변환
        //   - arr[1]과 arr[2]를 비교하기 위해 비트 연산자 사용
        // 2. 2번 예제 출력을 보면 " #####" n의
        // 3. 1이면 #, 0이면 공백문자로 변경
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
        }
        return answer;
    }
}