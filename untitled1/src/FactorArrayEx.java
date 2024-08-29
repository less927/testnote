import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FactorArrayEx {
    public static void main(String[] args) {

        int n = 24;
        FactorSolution solution = new FactorSolution();

        int[] FactorArray = solution.solution(n);

        System.out.println(Arrays.toString(FactorArray));


    }
}



class FactorSolution {
    public int[] solution(int n) {
        List<Integer> answer= new ArrayList<>();
        for (int  i = 1; i <= n; i++){
            if (n % i == 0){
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(x -> x).toArray();
    }
}
