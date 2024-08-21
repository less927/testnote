public class CutStringEx {
    public static void main(String[] args) {
        String my_string = ("nice to meet you");
        class Solution {
            public String solution(String my_string) {
                return my_string.replaceAll("a|e|i|o|u","");
            }
        }
        System.out.println(my_string.replaceAll("a|e|i|o|u",""));
    }
}
