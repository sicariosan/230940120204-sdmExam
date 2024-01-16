public class ReverseNumber {
    public static void main(String[] args) {
        int number = 23456789;
        int reversedNumber = 0;
        System.out.println("The original number  is: " + number);

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("The reversed  is: " + reversedNumber);

    }
}
