
class Solution {
    public int countLargestGroup(int n) {

        int[] arr = new int[37];

        for (int i = 1; i <= n; i++) {

            int num = i;
            int sum = 0;

            // Calculate sum of digits
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }

            // Count numbers in each group
            arr[sum]++;
        }

        int max = 0;
        int count = 0;

        // Find largest group size
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            } 
            else if (arr[i] == max) {
                count++;
            }
        }

        return count;
    }
}
