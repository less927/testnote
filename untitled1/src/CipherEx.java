public class CipherEx {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        Solution solution = new Solution();

        String answer = solution.solution(cipher, code);


        System.out.println(answer);
    }
}

        class Solution {
            public String solution(String cipher, int code) {
                String answer = "";

                for (int i = code; i <= cipher.length(); i = i +code) {
                    answer += cipher.substring(i -1, i);
                }
                return answer;
            }
       }




