public class CutStringEx2 {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";

        class Solution {
            public String solution(String my_string, String letter) {
                String answer = "";

                answer = my_string.replace(letter,"");

                return answer;
            }
        }
        System.out.println(my_string.replace(letter,""));
    }
}
