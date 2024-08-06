public class TernaryOperator {

    public static void main(String[] args) {

        class Solution {

            public int solution(String str1, String str2) {
                return (str1.contains(str2) ? 1 : 2);
            }
        }

        // 문자열 정의
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";

        // Solution 클래스의 인스턴스 생성 및 메서드 호출
        Solution sol = new Solution();
        int result = sol.solution(str1, str2);

        // 결과 출력
        System.out.println(result); // 예상 출력: 1 ("6CD"가 "ab6CDE443fgh22iJKlmn1o"에 포함되어 있으므로)
    }
}