//문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

public class SingleLetterEx {
    public static void main(String[] args) {

        String s = "abcabcadc";

        SingleLetterSolution solution = new SingleLetterSolution();
        String answer = solution.solution(s);
        System.out.println(answer);

    }
}

class SingleLetterSolution {
    public String solution(String s) {
        String answer = "";

        int[] alphaAry = new int[26];

        for(int i = 0; i < s.length(); i++){
            alphaAry[s.charAt(i)-'a']++;
        }

        for(int i = 0; i < alphaAry.length; i++){
            if(alphaAry[i]==1) answer+=(char)(i+'a');
        }

        return answer;
    }
}