public class PizzaEx2 {
    public static void main(String[] args) {
        int n = 10;
        int slices = 6;

        PizzaSolution solution = new PizzaSolution();
        int Per = solution.solution(n);
        System.out.println(Per);

    }
}

class PizzaSolution {
    public int solution(int n) {
        int answer = 1;
        int slices = 6;

        while (slices % n != 0) {
            answer ++;{
                slices = answer * 6;
            }
        }

        return answer;
    }
}
