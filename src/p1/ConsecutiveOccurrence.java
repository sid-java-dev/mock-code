package p1;


public class ConsecutiveOccurrence {
    public static void main(String[] args) {
        String str = "aa bb aaa cab";
        char maxChar = getMaxConsecutiveChar(str);

        System.out.println("Character with maximum consecutive occurrence: '" + maxChar + "'");
    }

    public static char getMaxConsecutiveChar(String str) {
        char[] ch = str.toCharArray();
        char maxChar = ch[0];
        int maxCount = 1;
        char currentChar = ch[0];
        int currentCount = 1;

        for (int i = 1; i < ch.length; i++) {
            if (currentChar == ch[i]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxChar = currentChar;
                }
                currentChar = ch[i];
                currentCount = 1;
            }
        }

        // Final check after the loop
        if (currentCount > maxCount) {
            maxCount = currentCount;
            maxChar = currentChar;
        }

        return maxChar;
    }
}



