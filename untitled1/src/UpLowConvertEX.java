public class UpLowConvertEX {
    public static void main(String[] args) {

        String my_string = "cccCCC";

        ConvSolution solution = new ConvSolution();

        String answer = solution.solution(my_string);

        System.out.println(answer);


    }
}



        class ConvSolution {
            public String solution(String my_string) {
                String answer = "";

                for(int i = 0; i < my_string.length(); i++) {
                    char c = my_string.charAt(i);
                    if(Character.isUpperCase(c)){
                        answer += String.valueOf(c).toLowerCase();
                    }else {
                        answer += String.valueOf(c).toUpperCase();
                    }
                }

                return answer;
            }
        }
