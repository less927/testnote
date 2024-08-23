public class SquareRootEx {
    public static void main(String[] args) {
        int n = 144;

        SqrtSolution solution = new SqrtSolution();

        System.out.println(Math.sqrt(n) % 1 == 0 ? 1 : 2);

    }
}

class SqrtSolution {
    public int solution(int n) {
        int answer = Math.sqrt(n) % 1 == 0 ? 1 : 2;
        return answer;
    }
}
