public class DiceFillEx {
    public static void main(String[] args) {

        int[] box = {10, 8, 6};
        int n = 3;

        DiceSolution solution = new DiceSolution();

        int FillDice = solution.solution(box, n);
        System.out.println(FillDice);


    }
}

class DiceSolution {
    public int solution(int[] box, int n) {
        int answer = 1;

        answer *= box[0] / n;
        answer *= box[1] / n;
        answer *= box[2] / n;

        return answer;
    }
}


