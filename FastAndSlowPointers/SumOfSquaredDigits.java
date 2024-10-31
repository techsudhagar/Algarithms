package Algarithms.FastAndSlowPointers;

class SumOfSquaredDigits{
    public static int sumOfSquaredDigits(int number) {
      int totalSum = 0;
      /* while (number != 0) {
        int digit = number % 10;
        number = number / 10;
        totalSum += (Math.pow(digit, 2));
      } */

      int digit = number % 10;
        number = number / 10;
        totalSum+= (Math.pow(digit, 2));
        totalSum+= (Math.pow(number, 2));

      return totalSum;
  }
}