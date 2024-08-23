public class ArrayandIndexEx {
    public static void main(String[] args) {
        int[] array = {9, 10, 11, 8};

        ArraySolution solution = new ArraySolution();

        int[] answer = solution.solution(array);

        System.out.print(answer[0]+ " " + answer[1]);

    }
}

class ArraySolution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        for(int i = 0; i < array.length; i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}

