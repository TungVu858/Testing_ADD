package fizz_buzz;

public class Fizz_Buzz {
    public static String FizzBuzzCheck(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (number > 0) {
            if (isFizz) {
                if (isBuzz) {
                    return "FizzBuzz";
                }
                return "Fizz";
            } else if (isBuzz) {
                return "Buzz";
            }

        }
        return number + " ";
    }

    public static String traslate(int number) {
        String[] strnum = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        int number1, number2;
        number2 = number % 10;
        number1 = number / 10;
        boolean isFizz = number1 == 3 || number2 == 3;
        boolean isBuzz = number1 == 5 || number2 == 5;
        if (number < 10) {
            if (number == 0) {
                return "không";
            } else {
                return number + strnum[number];
            }
        } else if (10 <= number && number < 20) {
            if (number1 == 1) {
                return number + " mười ";
            } else {
                if (isFizz) {
                    return number + " Fizz ";
                } else if (isBuzz) {
                    return number + " Buzz ";
                }
                return number + " mười " + strnum[number2];
            }
        } else if (20 < number && number < 100) {
            if (number2 == 0) {
                if (number1 == 3) {
                    return number + " Fizz ";
                } else if (number1 == 5) {
                    return number + " Buzz ";
                }
                return strnum[number1] + " mươi";
            } else {
                if (isFizz) {
                    return number + " Fizz ";
                } else if (isBuzz) {
                    return number + " Buzz ";
                }
                return number + strnum[number1] + " mươi " + strnum[number2];
            }
        } else {
            return number + " ";
        }
    }
}

