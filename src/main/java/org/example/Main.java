package org.example;

public class Main {
    public static void main(String[] args) {
        Company alfa = new CompanyET("", "10.04.2023", "BG12345678", "John Smith", 2000, 7000, 10000);
        System.out.println("The profit of " + alfa.getCompanyName() + " is " + alfa.calculateProfit());
        System.out.println("The capital increase of " + alfa.getCompanyName() + " is " + alfa.calculateCapitalIncrease());


        Company beta = new CompanyET("ET Beta", "01.01.2000", "BG11112223", "Anna Ride", 1000, 15000, 50000);
        System.out.println("The profit of " + beta.getCompanyName() + " is " + beta.calculateProfit());
        System.out.println("The capital increase of " + beta.getCompanyName() + " is " + beta.calculateCapitalIncrease());


        Company gamma = new CompanyEOOD("Gamma EOOD", "01.01.2000", "BG12345678", "Marry Poppins", 3000, 5000, 40000, 11000, 500);
        System.out.println("The profit of " + gamma.getCompanyName() + " is " + gamma.calculateProfit());
        System.out.println("The capital increase of " + gamma.getCompanyName() + " is " + gamma.calculateCapitalIncrease());
    }
}