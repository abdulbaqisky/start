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
      double[] leftVals = {25.0d, 225.0d, 11.0d, 100.0d};
      double[] rightVals = {92.0d, 17.0d, 3.0d, 50.0d};
      char[] opcode = {'a', 's', 'm', 'd'};
      double[] results = new double[opcode.length];

      for(int i= 0; i < opcode.length; i++) {
        switch (opcode[i]) {
          case 'a':
            results[i] = leftVals[i] + rightVals[i];
            break;
          case 's':
            results[i] = leftVals[i] - rightVals[i];
            break;
          case 'm':
            results[i] = leftVals[i] * rightVals[i];
            break;
          case 'd':
            results[i] = leftVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
            break;
          default:
            System.out.println("invalid opcode" + opcode[i]);
            results[i] = 0.0d;
            break;
        }
      }
      for (double currentResult: results) {
        System.out.println(currentResult);
      }

    }
}
