class Solution {
    public int sumFourDivisors(int[] nums) {
       int totalSum = 0;

        for (int num : nums) {
            int sum = 0;
            int count = 0;

            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    int div1 = i;
                    int div2 = num / i;

                    if (div1 == div2) {
                        count++;     
                        sum += div1;
                    } else {
                        count += 2;
                        sum += div1 + div2;
                    }

                    if (count > 4) break;
                }
            }

            if (count == 4) {
                totalSum += sum;
            }
        }

        return totalSum;  
    }
}