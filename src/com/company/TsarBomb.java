package com.company;

public class TsarBomb extends NuclearRocket  {
    private String type;

    public TsarBomb(int weight, int yearOfIssue, int impactPower, String type) {
        super(weight, yearOfIssue, impactPower);
        this.type = type;
    }


    @Override
    public void printInfo() {

        System.out.println("Weight " + getWeight() + " YearOfIssue " + getYearOfIssue() + " ImpactPower " + getImpactPower() + " " +
                "Type " + type);
    }
}
