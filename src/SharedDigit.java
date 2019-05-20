public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {

        if (number1 < 10 || number2 < 10 || number1 > 99 || number2 > 99) {

            return false;
        } else {

            int firstNum = 0;

            while (number1 != 0) {
                firstNum = number1 % 10;

                if (firstNum == number2 % 10 || firstNum == number2 / 10) {
                    return true;
                } else {
                    number1 = number1 / 10;
                }

            }
            return false;
        }
    }
}