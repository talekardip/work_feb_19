package com.training;

public class HDFC extends Bank{
    private String ifscCode;
    @Override
    public void show() {
        System.out.println("HDFC bank");
    }

    @Override
    public String getBankDetail(){
        return "HDFC details: "+super.getBankDetail();
    }
    @Override
    public double getMaturity(){
        return super.getYears()*super.getAmount()*super.getInterestRate()/100+super.getAmount();
    }
}
