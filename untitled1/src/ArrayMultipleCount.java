public class ArrayMultipleCount {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = 3;

        MpSolution solution = new MpSolution();

        int[] answer = solution.solution(n, array);

        for (int i : answer) {
            System.out.print(i + " ");

    }
}
}

class MpSolution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        for(int i : numlist){
            if(i%n==0){
                count++;
            }
        }

        int[] answer = new int[count];
        int idx = 0;
        for(int i : numlist){
            if(i%n==0){
                answer[idx]=i;
                idx++;
            }
        }


        return answer;
    }
}

