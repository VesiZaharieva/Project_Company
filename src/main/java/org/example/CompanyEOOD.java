package org.example;

public class CompanyEOOD extends CompanyET {

    public CompanyEOOD(String companyName, String dateCreation, String bulstat, String ownerName, int startingCapital, int currentCapital, int annualIncome, int annualExpenses, int ownerProperty) {
        super(companyName, dateCreation, bulstat, ownerName, startingCapital, currentCapital, annualIncome);
    }
private int annualExpenses;
private int ownerProperty;
private int capIncrease;

    private void setAnnualExpenses(int annualExpenses) {
        if (this.companyName != null) {
            if (this.dateCreation != null) {
                if (this.bulstat != null) {
                    if (this.getOwnerName() != null) {
                        if (this.getStartingCapital() > 0) {
                            this.annualExpenses = annualExpenses;
                        }
                    }
                }
            }
        }
    }

    private void setOwnerProperty(int ownerProperty) {
        if (this.companyName != null) {
            if (this.dateCreation != null) {
                if (this.bulstat != null) {
                    if (this.getOwnerName() != null) {
                        if (this.getStartingCapital() > 0) {
                            this.ownerProperty = ownerProperty;
                        }
                    }
                }
            }
        }
    }

    private int getAnnualExpenses() {
        return this.annualExpenses;
    }

    private int getOwnerProperty() {
        return this.ownerProperty;
    }

    @Override
    public double calculateCapitalIncrease() {
        if (this.companyName == null) {
            if (this.dateCreation == null) {
                if (this.bulstat == null) {
                    if (this.getOwnerName() == null) {
                        if (this.getStartingCapital() <= 0) {
                            return 0.00;
                        }
                    }
                }
            }
        }
        return super.calculateCapitalIncrease() - getOwnerProperty();
    }

    @Override
    public double calculateProfit() {
        if (this.companyName == null) {
            if (this.dateCreation == null) {
                if (this.bulstat == null) {
                    if (this.getOwnerName() == null) {
                        if (this.getStartingCapital() <= 0) {
                            return 0.00;
                        }
                    }
                }
            }
        }
        return getAnnualIncome() - getAnnualExpenses();
    }

}

