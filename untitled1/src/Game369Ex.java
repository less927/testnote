public class Game369Ex {
    public static void main(String[] args) {
        int order = 3333;

        TSNSolution solution = new TSNSolution();

        int answer = solution.solution(order);
        System.out.println(answer);
    }
}


class TSNSolution {
    public int solution(int order) {
        String str = order + "";
        int answer = 0;


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '3' | c == '6' | c == '9' ) answer++;
        }
        return answer;
    }
}
