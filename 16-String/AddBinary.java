public class AddBinary {
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2); // current bit
            carry = sum / 2;    // carry for next position
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String result = addBinary(a, b);
        System.out.println("Sum: " + result); 
    }
}
