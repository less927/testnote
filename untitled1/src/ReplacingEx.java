import java.util.*;

public class ReplacingEx {
    public static void main(String[] args) {
        String my_string = "hi12392";

        ReplaceSolution solution = new ReplaceSolution();

        int[] Replaced = solution.solution(my_string);
        System.out.println(Arrays.toString(Replaced));


    }

}


class ReplaceSolution {
    public int[] solution(String my_string) {

        my_string = my_string.replaceAll("[a-z]","");

        int[] answer = new int[my_string.length()];

        for(int i =0; i<my_string.length(); i++){
            answer[i] = my_string.charAt(i) - '0';
        }

        Arrays.sort(answer);

        return answer;
    }
}


