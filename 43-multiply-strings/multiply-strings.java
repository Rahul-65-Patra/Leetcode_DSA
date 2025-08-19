class Solution {
    public String multiply(String num1, String num2) {
        // Quick outs
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n1 = num1.length(), n2 = num2.length();
        int[] res = new int[n1 + n2];

        // i in num1, j in num2, place results at i+j and i+j+1
        for (int i = n1 - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = n2 - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';

                int mul = d1 * d2;
                int p2 = i + j + 1;
                int p1 = i + j;

                int sum = mul + res[p2];
                res[p2] = sum % 10;     // current digit
                res[p1] += sum / 10;    // carry
            }
        }

        // Build string, skipping leading zeros
        StringBuilder sb = new StringBuilder();
        for (int d : res) {
            if (sb.length() == 0 && d == 0) continue;
            sb.append(d);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
