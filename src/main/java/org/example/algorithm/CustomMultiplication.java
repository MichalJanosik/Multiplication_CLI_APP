package org.example.algorithm;

public class CustomMultiplication implements Multiplication {
    public String twoStringsMultiply(String n1, String n2) {
        if (n1.matches("0+") || n2.matches("0+")) {
            return "0";
        }

        int lengthN1 = n1.length();
        int lengthN2 = n2.length();
        int[] result = new int[lengthN1 + lengthN2];

        int i_n1 = 0;
        int i_n2;

        for (int i = lengthN1 - 1; i >= 0; i--) {
            int carry = 0;
            int digit1 = n1.charAt(i) - '0';
            i_n2 = 0;

            for (int j = lengthN2 - 1; j >= 0; j--) {
                int digit2 = n2.charAt(j) - '0';

                int sum = digit1 * digit2 + result[i_n1 + i_n2] + carry;
                carry = sum / 10;
                result[i_n1 + i_n2] = sum % 10;

                i_n2++;
            }

            if (carry > 0) {
                result[i_n1 + i_n2] += carry;
            }
            i_n1++;
        }

        int x = result.length - 1;
        while ((x >= 0) && result[x] == 0) {
            x--;
        }

        StringBuilder output = new StringBuilder();
        while (x >= 0) {
            output.append(result[x--]);
        }
        return output.toString();
    }
}
