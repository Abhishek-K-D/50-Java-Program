import java.util.*;

public class KthLargestUnique {

    static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        int count = 1;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] != nums[i + 1])
                count++;

            if (count == k)
                return nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(findKthLargest(nums, k));

        sc.close();
    }
}