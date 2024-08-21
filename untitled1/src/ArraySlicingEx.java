import java.util.Arrays;

public class ArraySlicingEx {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;

        Solution solution = new Solution();
        int[] result = solution.solution(numbers, num1, num2);

        System.out.println(Arrays.toString(result));  // 결과 배열 출력
    }

    static class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            return Arrays.copyOfRange(numbers, num1 , num2 + 1);
        }
    }
}