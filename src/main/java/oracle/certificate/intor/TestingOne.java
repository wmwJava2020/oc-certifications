package oracle.certificate.intor;

public class TestingOne {

     static boolean solution() {

        String line = "123_456_789";
        boolean atLeastOneDigit = false;
        if (line.charAt(line.length() - 1) == '#') {
            int i = 0;
            int base = 0;
            ///
            if (base < 2 || base > 16) {
                return false;
            }
            i++;
            while (i < line.length() - 1) {
                if (line.charAt(i) != '_') {
                    int digit = -1;
                    if ('a' <= line.charAt(i) && line.charAt(i) <= 'f') {
                        digit = (int)line.charAt(i) - (int)'a' + 10;
                    }
                    if ('A' <= line.charAt(i) && line.charAt(i) <= 'F') {
                        digit = (int)line.charAt(i) - (int)'A' + 10;
                    }
                    if ('0' <= line.charAt(i) && line.charAt(i) <= '9') {
                        digit = line.charAt(i) - (int)'0';
                    }
                    if (0 <= digit && digit < base) {
                        atLeastOneDigit = true;
                    }
                    else {
                        return false;
                    }
                }
                i++;
            }
        }
        else {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != '_') {
                    if ('0' <= line.charAt(i) && line.charAt(i) <= '9') {
                        atLeastOneDigit = true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return atLeastOneDigit;
    }

    public static void main(String[] args) {
        boolean solution = solution();
        System.out.println(solution);
    }
}
