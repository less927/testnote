class Solution {
public static void main(String[] args) {
    int[] num_list = {1, 2, 3, 4, 5}; // 배열 선언 및 초기화

    // 짝수와 홀수의 개수를 저장할 변수
    int a = 0; // 짝수의 개수
    int b = 0; // 홀수의 개수

    // 배열을 순회하여 짝수와 홀수의 개수 계산
    for (int i = 0; i < num_list.length; i++) {
        if (num_list[i] % 2 == 0) {
            a++; // 짝수일 때
        } else {
            b++; // 홀수일 때
        }
    }

    // 결과 출력
    System.out.println("짝수의 개수: " + a);
    System.out.println("홀수의 개수: " + b);
}
}