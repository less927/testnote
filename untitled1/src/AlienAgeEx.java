public class AlienAgeEx {
    public static void main(String[] args) {
        int age = 23;
        AlienAgeSolution solution = new AlienAgeSolution();

        String Age = solution.solution(age);
        System.out.println(Age);
    }
}

class AlienAgeSolution {
    public String solution(int age) {
        String answer = "";
        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};

        while(age>0){
            answer = alpha[age % 10] + answer;
            age /= 10;
        }

        return answer;
    }
}
