public class DcEx {
    public static void main(String[] args) {
        int price = 150000;
        class Solution {
            public int solution(int price) {
                int answer = 0;
                if (price >= 500000){
                    price *= 0.8;
                } else if (price >= 300000){
                    price *= 0.9;
                } else if (price >= 100000){
                    price *= 0.95;
                }
                return price;
            }
        }
        System.out.println(price);
    }
}
