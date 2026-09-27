class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for (int x : salary) {
            sum += x;
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        return (double)(sum - min - max) / (salary.length - 2);
    }
}