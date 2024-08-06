public class CupsAndRemainEx {
    public static void main(String[] args) {
        int money = 15000;
        Solution solution = new Solution();
        int[] result = solution.solution(money);

        System.out.println(result[0] + "잔, " + result[1] + "원");
    }

    static class Solution {
        public int[] solution(int money) {
            return new int[] {money / 5500 , money % 5500};
        }
    }
}