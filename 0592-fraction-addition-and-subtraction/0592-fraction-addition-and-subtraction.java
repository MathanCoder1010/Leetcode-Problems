import java.util.Scanner;

class Solution {
    public String fractionAddition(String expression) {
        int num = 0, den = 1;
        
        Scanner sc = new Scanner(expression).useDelimiter("(?=[+-])");
        
        while (sc.hasNext()) {
            String[] parts = sc.next().split("/");
            int n = Integer.parseInt(parts[0]);
            int d = Integer.parseInt(parts[1]);
            
            num = num * d + n * den;
            den = den * d;
            
            int g = gcd(Math.abs(num), den);
            num /= g;
            den /= g;
        }
        
        sc.close();
        return num + "/" + den;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}