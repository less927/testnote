public class ReverseStringEX {

    // 문자열을 뒤집는 메소드
    public static String reverseString(String input) {
        // StringBuilder를 사용하여 문자열을 뒤집음
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String myString = "example";

        // reverseString 메소드를 호출하여 문자열을 뒤집음
        String reversedString = reverseString(myString);

        // 결과 출력
        System.out.println("원본 문자열: " + myString);
        System.out.println("뒤집힌 문자열: " + reversedString);
    }
}