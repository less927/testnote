public class CountStrEx {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};

        // CountStrSolution 클래스의 인스턴스를 생성하여 solution 메소드를 호출합니다.
        CountStrSolution solution = new CountStrSolution();
        int[] answer = solution.solution(strlist);

        // 결과를 출력합니다.
        for (int length : answer) {
            System.out.print(length);
        }
    }
}

// 별도의 CountStrSolution 클래스를 외부에 정의합니다.
class CountStrSolution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}


