public class RemoveDuplicationEx {
    public static void main(String[] args) {
        String my_string = "we are the world";
        DuplicationSolution solution = new DuplicationSolution();

        String Removed = solution.solution(my_string);
        System.out.println(Removed);
    }
}

class DuplicationSolution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (!answer.contains(String.valueOf(my_string.charAt(i)))) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
