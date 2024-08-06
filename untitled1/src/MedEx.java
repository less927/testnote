import java.util.*;



public class MedEx {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};

    }

        public int solution(int[] array) {
            Arrays.sort(array);
            return array[array.length / 2];
        }
    }

