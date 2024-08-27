import java.util.Arrays;



public class MakeTriangleEx {
    public static void main(String[] args) {

        int[] sides = {199, 72, 222};

        SidesSolution solution = new SidesSolution();
        int Triangle = solution.solution(sides);
        System.out.println(Triangle);


    }
}


class SidesSolution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if (sides[2] >= sides[0]+sides[1]) {
            answer = 2;
        } else {
            answer = 1;
        }

        return answer;
    }
}
