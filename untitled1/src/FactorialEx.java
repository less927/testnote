public class FactorialEx {
    public static void main(String[] args) {
        int n = 7;

        FactorialSolution solution = new FactorialSolution();

        int answer = solution.solution(n);
        System.out.println(answer);
    }
}

class FactorialSolution {
    public int solution(int n) {
        int fac = 1;
        int i = 0;

        while(true){
            if(fac <= n) {
                fac *= i +1;
                i++;
            } else break;
        }
        return i - 1;
    }
}
