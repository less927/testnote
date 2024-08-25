import java.util.Arrays;


public class FindMaxEx {
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -5};

        MaxSolution solution = new MaxSolution();

        int maxnumber = solution.solution(numbers);

        System.out.println(maxnumber);



    }
}

class MaxSolution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }
}



