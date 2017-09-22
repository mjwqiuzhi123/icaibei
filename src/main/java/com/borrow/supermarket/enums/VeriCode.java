package com.borrow.supermarket.enums;

public class VeriCode
{
  public static enum VeriCodeType
  {
    SignUp, ResetLoginPassword, ResetPaymentPassword, VeriImage;
  }
  
  public static void main(String[] args) {
	  VeriCodeType.SignUp.ordinal();
}
  
}