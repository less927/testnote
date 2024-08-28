import java.util.Arrays;
public class ArrayRotateEx {
    public static void main(String[] args) {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};

        String Direction = "left";

        RotateSolution solution = new RotateSolution();

        int[] Rotated = solution.solution(numbers, Direction);

        System.out.println(Arrays.toString(Rotated));
    }
}


class RotateSolution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length -1];
            for (int i = 0; i < numbers.length -1; i++) {
                answer[i + 1] = numbers[i];
            }
        } else {
            answer[answer.length - 1] = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                answer [i -1] = numbers[i];
            }
        }

        return answer;
    }
}
