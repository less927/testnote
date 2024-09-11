import java.util.*;

public class CloseNumEx {
    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;
        CloseNumSolution solution = new CloseNumSolution();

        int answer = solution.solution(array, n);
        System.out.println(answer);

    }
}

class CloseNumSolution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }
}
