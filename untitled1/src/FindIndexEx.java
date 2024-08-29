public class FindIndexEx {
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;

        IndexSolution solution = new IndexSolution();
        int index = solution.solution(num, k);

        System.out.println(index);

    }
}


class IndexSolution {
    public int solution(int num, int k) {
        int answer = -1;

        String str = String.valueOf(num);

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == k + '0'){
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}