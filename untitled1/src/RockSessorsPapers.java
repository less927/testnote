public class RockSessorsPapers {
    public static void main(String[] args) {
        int[] rsp = {2, 0, 5};  // 주어진 배열

        // int[] 배열을 String으로 변환
        String rspString = "";
        for (int num : rsp) {
            rspString += Integer.toString(num);  // 배열의 각 정수를 문자열로 변환하여 연결
        }

        // Solution 객체를 생성하고, 변환 메서드를 호출합니다.
        RSPSolution solution = new RSPSolution();
        String answer = solution.solution(rspString);

        // 변환된 결과를 출력합니다.
        System.out.println(answer);
    }
}

class RSPSolution {
    public String solution(String rsp) {
        char[] cRsp = rsp.toCharArray();  // 문자열을 문자 배열로 변환
        StringBuilder answer = new StringBuilder();  // 변환 결과를 저장할 StringBuilder 객체

        // 문자 배열을 순회
        for (int i = 0; i < cRsp.length; i++) {
            switch(cRsp[i]) {
                case '0' :
                    answer.append("5");  // '0'을 '5'로 변환
                    break;
                case '2' :
                    answer.append("0");  // '2'를 '0'으로 변환
                    break;
                case '5' :
                    answer.append("2");  // '5'를 '2'로 변환
                    break;
            }
        }

        return answer.toString();  // StringBuilder 객체를 문자열로 변환하여 반환
    }
}
