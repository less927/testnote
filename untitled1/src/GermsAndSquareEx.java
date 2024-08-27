public class GermsAndSquareEx {
    public static void main(String[] args) {
        int n = 7;
        int t = 15;

        GermsSolution solution = new GermsSolution();
        int result = solution.solution(n,t);
        System.out.println(result);
    }
}

class GermsSolution {
    public int solution(int n, int t) {
        int germs = (int)Math.pow(2, t);
        int answer = germs * n;
        return answer;
    }
}