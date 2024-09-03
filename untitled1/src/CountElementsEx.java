public class CountElementsEx {
    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;

        CountSolution solution = new CountSolution();
        int count = solution.solution(i,j,k);

        System.out.println(count);
    }
}

class CountSolution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int n = i; n <= j; n++) {

            String str = n+"";
            for (int l = 0; l< str.length(); l++) {
                if (str.charAt(l)-'0' == k) answer++;
            }
        }

        return answer;
    }
}
