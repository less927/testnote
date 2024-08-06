package exnotes;


class Solution {
    int[] num_list = {1, 2, 3, 4, 5};
    public int[] solution(int[] num_list) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < num_list.length; i++)
            if (num_list[i] % 2 == 0) {
                a++;
            } else {
                b++;
            }
        return new int[]{a, b};
    }
}