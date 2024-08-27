public class SummeryEx {
    public static void main(String[] args) {
        int n = 1234;

        SumSolution solution = new SumSolution();

        int Sum = solution.solution(n);

        System.out.println(Sum);


    }
}

class SumSolution {
    public int solution(int n) {
        int answer = 0;
        String str_n = Integer.toString(n);
        for(int i = 0; i < str_n.length(); i++) {
            answer +=  Character.getNumericValue(str_n.charAt(i));
        }

        return answer;
    }
}
