public class MorseEx {
    public static void main(String[] args) {
        String letter = ".--. -.-- - .... --- -.";

        MorseSolution solution = new MorseSolution();
        String code = solution.solution(letter);
        System.out.println(code);


    }
}

class MorseSolution {
    public String solution(String letter) {
        String answer = "";
        String[]  morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] word  = letter.split(" ");

        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < morse.length; j++){
                if (word[i].equals(morse[j])) answer += (char)(j+97);
            }
        }

        return answer;
    }
}
