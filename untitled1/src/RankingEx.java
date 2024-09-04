import java.util.Arrays;


public class RankingEx {
    public static void main(String[] args) {
        int[] emergency = {1, 2, 3, 4, 5, 6, 7};

        RankSolution solution = new RankSolution();

        int[] Ranked = solution.solution(emergency);
        System.out.println(Arrays.toString(Ranked));

    }
}

class RankSolution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j])
                    answer[i]++;
            }
        }
        return answer;
    }
}