package com.company;

public class MathEquation {
  double leftVal;
  double rightVal;
  char opCode;
  double result;

  private static int numberOfCalculations;
  private static double sumOfResults;


  public MathEquation() {
  }

  public MathEquation(char opCode) {
    this.opCode = opCode;
  }

  public MathEquation(char opCode, double leftVal, double rightVal) {
    this(opCode);
    this.leftVal = leftVal;
    this.rightVal = rightVal;
  }

  public void execute() {
    switch (opCode) {
      case 'a' -> result = leftVal + rightVal;
      case 's' -> result = leftVal - rightVal;
      case 'm' -> result = leftVal * rightVal;
      case 'd' -> result = leftVal != 0 ? leftVal / rightVal : 0.0d;
      default -> {
        System.out.println("invalid opcode" + opCode);
        result = 0.0d;
      }
    }
    numberOfCalculations++;
    sumOfResults += result;
  }

  public void execute(double leftVal, double rightVal) {
    this.leftVal = leftVal;
    this.rightVal = rightVal;

    execute();
  }

  public static double getAverageResult() {
    return sumOfResults / numberOfCalculations;
  }

  public void setLeftVal(double leftVal) {
    this.leftVal = leftVal;
  }

  public double getLeftVal() {
    return leftVal;
  }

  public double getRightVal() {
    return rightVal;
  }

  public void setRightVal(double rightVal) {
    this.rightVal = rightVal;
  }

  public void setOpCode(char opCode) {
    this.opCode = opCode;
  }

  public double getResult() {
    return result;
  }
}
