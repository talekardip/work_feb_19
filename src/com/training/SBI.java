package com.training;

public class SBI extends Bank{
    private String ifscCode;
    private double interestRate = 3;

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    @Override
    public void show() {
        System.out.println("SBI bank");
    }

    @Override
    public String getBankDetail(){
        return "SBI details: "+super.getBankDetail();
    }
    @Override
    public double getMaturity(){
        return super.getYears()*super.getAmount()*super.getInterestRate()/100+super.getAmount();
    }
}
