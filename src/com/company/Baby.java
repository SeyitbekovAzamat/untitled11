package com.company;

public class Baby extends NuclearRocket  {
    private int yearOfUse;

    public Baby(int weight, int yearOfIssue, int impactPower, int yearOfUse) {
        super(weight, yearOfIssue, impactPower);
        this.yearOfUse = yearOfUse;
    }

    @Override
    public void printInfo() {
        System.out.println("Weight " + getWeight() + " YearOfIssue " + getYearOfIssue() + " ImpactPower " + getImpactPower() + " " +
                "YearOfUse" + yearOfUse);
    }


}
