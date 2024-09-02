import java.util.*;

public class ToLowerAndSortEx {
    public static void main(String[] args) {

        String my_string = "python";

        ToLowerSolution solution = new ToLowerSolution();

        String Lower = solution.solution(my_string);
        System.out.println(Lower);



    }
}


class ToLowerSolution {
    public String solution(String my_string) {
        String answer = "";
        String[] word = my_string.toLowerCase().split("");

        Arrays.sort(word);
        for (int i = 0; i < word.length; i++){
            answer +=word[i];
        }
        return answer;
    }
}

