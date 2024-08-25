public class PizzaEx {
    public static void main(String[] args) {
        int slice = 7;
        int n = 10;

        SliceSolution solution = new SliceSolution();

        int pizzabox = solution.solution(slice,n);
        System.out.println(pizzabox);

    }
}

class SliceSolution {
    public int solution(int slice, int n) {
        int answer = 0;
        if (n % slice == 0)
        {
            answer = n / slice;
        } else {
            answer = n / slice +1;
        }
        return answer;
    }
}
