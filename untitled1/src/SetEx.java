public class SetEx {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        // Solution 클래스의 인스턴스를 생성
        SetSolution solution = new SetSolution();

        // solution 메서드를 호출하여 결과를 answer에 저장
        int answer = solution.solution(s1, s2);

        // 결과 출력
        System.out.println("Common elements count: " + answer);
    }
}

// Solution 클래스를 SetEx 클래스와 같은 파일에 정의합니다.
class SetSolution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}