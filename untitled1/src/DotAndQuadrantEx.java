public class DotAndQuadrantEx {
    public static void main(String[] args) {
        int[] dot = {-3, 3};

        // Solution 클래스의 인스턴스를 생성
        DotSolution solution = new DotSolution();

        // solution 메서드를 호출하여 결과를 answer에 저장
        int answer = solution.solution(dot);

        // 결과 출력
        System.out.println("The point is in quadrant: " + answer);
    }
}

class DotSolution {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1; // 1사분면
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4; // 4사분면
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2; // 2사분면
        } else {
            answer = 3; // 3사분면
        }
        return answer;
    }
}
