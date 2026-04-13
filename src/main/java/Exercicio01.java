public static int greaterThan(int firstNumber, int secondNumber) {
  return Math.max(firstNumber, secondNumber);
}

void main() {
  var maximum = greaterThan(10, 42);
  System.out.println("O maior número é: " + maximum);
}
