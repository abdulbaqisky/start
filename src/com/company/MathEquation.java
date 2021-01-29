package com.company;

public class MathEquation {
  double leftVal;
  double rightVal;
  char opCode;
  double result;

  void execute() {
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
  }

  public void setLeftVal(double leftVal) {
    this.leftVal = leftVal;
  }

  public void setRightVal(double rightVal) {
    this.rightVal = rightVal;
  }

  public void setOpCode(char opCode) {
    this.opCode = opCode;
  }
}
