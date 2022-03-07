package com.company;

public class Fat extends NuclearRocket {
    private String cityActive;

    public Fat(int weight, int yearOfIssue, int impactPower, String cityActive) {
        super(weight, yearOfIssue, impactPower);
        this.cityActive = cityActive;
    }

    @Override
    public void printInfo() {
        System.out.println("Weight " + getWeight() + " YearOfIssue " + getYearOfIssue() + " ImpactPower " + getImpactPower() +
                " CitiAcrive" + cityActive);

    }
}

