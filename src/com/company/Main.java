package com.company;

public class Main {

    public static void main(String[] args) {
        /*float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = byteVal ;
        short result2 = (short) longVal;
        short result3 = (short) doubleVal;
        short result4 = (short) floatVal;

        long result5 = shortVal;
        long result6 = (long) doubleVal;
        long result7 = (long) floatVal;

        float result8 = longVal;
        float result9 = (float) doubleVal;
        float result10 = (short) floatVal;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(result10);*/
      performCalculations();
    }

  private static void performCalculations() {
    double[] leftVals = {25.0d, 225.0d, 11.0d, 100.0d};
    double[] rightVals = {92.0d, 17.0d, 3.0d, 50.0d};
    char[] opcodes = {'a', 's', 'm', 'd'};
    double[] results = new double[opcodes.length];

    MathEquation[] equations = new MathEquation[4];
    equations[0] = create(25.0d, 92.0d, 'a');
    equations[0] = create(225.0d, 17.0d, 's');
    equations[0] = create(11.0d, 3.0d, 'm');
    equations[0] = create(100.0d, 50.0d, 'd');

    for(int i= 0; i < opcodes.length; i++) {
      results[i] = execute(opcodes[i], leftVals[i], rightVals[i]);
    }

    for (double currentResult: results)
      System.out.println(currentResult);
  }

  private static MathEquation create(double leftVal, double rightVal, char opCode) {
      MathEquation equation = new MathEquation();
      equation.leftVal = leftVal;
      equation.rightVal = rightVal;
      equation.opCode = opCode;
      return equation;
  }

  static double execute(char opcode, double leftVal, double rightVal) {
      double result;
      switch (opcode) {
        case 'a' -> result = leftVal + rightVal;
        case 's' -> result = leftVal - rightVal;
        case 'm' -> result = leftVal * rightVal;
        case 'd' -> result = leftVal != 0 ? leftVal / rightVal : 0.0d;
        default -> {
          System.out.println("invalid opcode" + opcode);
          result = 0.0d;
        }
      }
      return result;
    }
}