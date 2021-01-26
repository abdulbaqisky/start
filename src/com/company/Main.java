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
      double value1 = 100.0d;
      double value2 = 50.0d;
      double result=0.0d;
      char opcode = 'd';

      if (opcode == 'a') {
        result = value1 + value2;
      } else if (opcode == 's') {
        result = value1 - value2;
      } else if (opcode == 'm') {
        result = value1 * value2;
      } else if (opcode == 'd') {
          if (value2 != 0)
            result = value1 / value2;
        } else{
          System.out.println("invalid opcode" + opcode);
          result = 0.0d;
        }
        System.out.println(result);

    }
}
