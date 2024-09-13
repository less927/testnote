import java.util.*;

public class MinusZEX {
    public static void main(String[] args) {
        String s = "1 2 Z 3";

        MinusSolution solution = new MinusSolution();
        int answer = solution.solution(s);
        System.out.println(answer);

    }
}


class MinusSolution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}
