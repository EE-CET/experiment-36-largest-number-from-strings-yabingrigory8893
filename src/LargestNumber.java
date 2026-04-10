import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            String[] nums = new String[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNext()) {
                    nums[i] = sc.next();
                }
            }

            Arrays.sort(nums, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    String order1 = s1 + s2;
                    String order2 = s2 + s1;
                    return order2.compareTo(order1);
                }
            });

            if (nums[0].equals("0")) {
                System.out.println("0");
                return;
            }

            StringBuilder sb = new StringBuilder();
            for (String s : nums) {
                sb.append(s);
            }
            System.out.println(sb.toString());
        }
    }
}
