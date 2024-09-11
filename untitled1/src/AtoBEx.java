import java.util.Arrays;

public class AtoBEx {
    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";

        AtoBSolution solution = new AtoBSolution();
        int answer = solution.solution(before, after);

        System.out.println(answer);

    }
}




class AtoBSolution{
    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 : 0;

    }
}