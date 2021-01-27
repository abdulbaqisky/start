package com.company;

import java.util.Scanner;

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
      char[] opcodes = {'a', 's', 'm', 'd'};
      double[] results = new double[opcodes.length];

      if(args.length == 0) {
        for (int i = 0; i < opcodes.length; i++) {
          results[i] = execute(opcodes[i], leftVals[i], rightVals[i]);
        }

        for (double currentResult : results)
          System.out.println(currentResult);
      }else if(args.length == 3){
        handleCommandLine(args);
      }else if(args.length == 1 && args[0].equals("interactive"))
        handleInteractively();
      else
        System.out.println("Please provide an operation code and two numerical values");

    }

    static void handleInteractively(){
      System.out.println("Enter an operation and two numbers");
      Scanner scanner= new Scanner(System.in);
      String userInput = scanner.nextLine();
      String [] parts = userInput.split(" ");
      performOperation(parts);

    }

  private static void performOperation(String[] parts) {
      char opcode = opcodeFromString(parts[0]);
      double leftVal = valueFromWord(parts[1]);
      double rightVal = valueFromWord(parts[2]);
      double result = execute(opcode, leftVal, rightVal);
      displayResult(opcode, leftVal, rightVal, result);
  }

  private static char symbolFromOpcode(char opCode) {
    char[] opCodes = {'a', 's', 'm', 'd'};
    char[] symbols = {'+', '-', '*', '/'};
    char symbol = ' ';
    for (int i = 0; i < opCodes.length; i++) {
      if (opCode == opCodes[i])
        symbol = symbols[i];
        break;
    }
    return symbol;

  }

  private static void displayResult(char opcode, double leftVal, double rightVal, double result) {
      char symbol = symbolFromOpcode(opcode);
      StringBuilder builder = new StringBuilder(20);
      builder.append(leftVal);
      builder.append(" ");
      builder.append(symbol);
      builder.append(" ");
      builder.append(rightVal);
      builder.append(" = ");
      builder.append(result);
      String output = builder.toString();
      System.out.println(output);
  }

  private static void handleCommandLine(String[] args) {
      char opcode = args[0].charAt(0);
      double lefVal = Double.parseDouble(args[1]);
      double rightVal = Double.parseDouble(args[2]);
      double result = execute(opcode, lefVal, rightVal);
      System.out.println(result);
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

    static char opcodeFromString(String operationName){
      char opcode = operationName.charAt(0);
      return opcode;
    }

    static double valueFromWord(String word){
      String[] numberWords = {
          "zero", "one", "two", "three", "four",
          "five", "six", "seven", "eight", "nine"
      };
      double value =0d;
      for(int index =0; index <= numberWords.length; index++){
        if(word.equals(numberWords[index])){
          value = index;
          break;
        }
      }
      return value;
    }
}