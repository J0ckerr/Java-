import java.util.Scanner;
public class สýื้ฬ๘ิพ {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine().trim();
        String strs[] = s.substring(1, s.length() - 1).split(",");
        int nums[] = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }

        solution(nums);

    }

    private static void solution(int[] nums) {
        // TODO Auto-generated method stub
        if (nums.length <= 0 || nums == null)
            return;
        boolean[] flags = new boolean[nums.length];
        int i = 0;
        flags[i] = true;

        while (i < nums.length && i >= 0) {
            int temp = nums[i];
            i = i + temp;

            if (i >= nums.length || i < 0) {
                System.out.println(true);
                return;
            }
            if (!flags[i]) {
                flags[i] = true;
            } else if (flags[i]) {
                System.out.println(false);
                return;
            }
        }
    }

}
