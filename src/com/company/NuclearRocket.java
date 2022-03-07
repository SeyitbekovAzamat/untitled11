package com.company;

public abstract class NuclearRocket implements Printable {
    private int weight;
    private int yearOfIssue;
    private int impactPower;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getImpactPower() {
        return impactPower;
    }

    public void setImpactPower(int impactPower) {
        this.impactPower = impactPower;
    }

    public NuclearRocket(int weight, int yearOfIssue, int impactPower) {
        this.weight = weight;
        this.yearOfIssue = yearOfIssue;
        this.impactPower = impactPower;
    }

    public abstract void printInfo();
}
