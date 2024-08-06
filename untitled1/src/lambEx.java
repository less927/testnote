public class lambEx {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        class Solution {
            public int solution(int n, int k) {
                return n * 12000 + k * 2000 - (n / 10 * 2000);
            }
        }
        System.out.println(n * 12000 + k * 2000 - (n / 10 * 2000));
    }
}

