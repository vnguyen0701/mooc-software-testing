package tudelft.roman;

public class myRomanNumeral {
    public int convert(String romanNumeral) {
        int[] inputArr = new int[romanNumeral.length()];
        int retVal = 0;
        int n = 0;
        boolean wrongInput = false;
        for (char chars : romanNumeral.toCharArray()) {
            switch (chars) {
                case 'I':
                    inputArr[n] = 1;
                    break;
                case 'V':
                    inputArr[n] = 5;
                    break;
                case 'X':
                    inputArr[n] = 10;
                    break;
                case 'L':
                    inputArr[n] = 50;
                    break;
                case 'C':
                    inputArr[n] = 100;
                    break;
                case 'D':
                    inputArr[n] = 500;
                    break;
                case 'M':
                    inputArr[n] = 1000;
                    break;
                default:
                    wrongInput = true;
            }
            n++;
        }
        if (wrongInput)
            return retVal = -1;
        int m = 1;
        int save = 0;
        int nextVal = 0;
        for (int val : inputArr) {
            if (m < inputArr.length) {
                nextVal = inputArr[m];
                if (val < nextVal) {
                    if (save != 0)
                        return -1; //only one substraction allowed
                    else
                        save = save - val;
                } else if (val == nextVal) {
                    save = save + val;
                } else {
                    retVal = retVal + val + save;
                    save = 0;
                }
            } else
                retVal = retVal + val + save;
            m++;
        }

        return retVal;
    }

}
