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
      
    MathEquation[] equations = new MathEquation[4];
    equations[0] = create(25.0d, 92.0d, 'a');
    equations[1] = create(225.0d, 17.0d, 's');
    equations[2] = create(11.0d, 3.0d, 'm');
    equations[3] = create(100.0d, 50.0d, 'd');

    for (MathEquation equation: equations) {
      equation.execute();
      System.out.println("result = " + equation.result);

    }
  }

  private static MathEquation create(double leftVal, double rightVal, char opCode) {
      MathEquation equation = new MathEquation();
      equation.leftVal = leftVal;
      equation.rightVal = rightVal;
      equation.opCode = opCode;
      return equation;
  }
}