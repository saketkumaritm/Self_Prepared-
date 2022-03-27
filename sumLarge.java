import java.util.Scanner;

class sumLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int asize = a.length();
        int bsize = b.length();

        int i = asize - 1;
        int j = bsize - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 && j >= 0 && carry > 0) {
            int num1 = a.charAt(i) - '0';
            int num2 = b.charAt(j) - '0';
            int sum = num1 + num2 + carry;
            int unit = sum % 10;
            carry = sum / 10;
            i--;
            j--;
        }
        System.out.println(result);
    }

}