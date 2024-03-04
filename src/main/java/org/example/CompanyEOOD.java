package org.example;

public class CompanyEOOD (int annualExpenses, int ownerProperty) extends CompanyET (String companyName, String dateCreation, String bulstat, String ownerName, {
    public CompanyEOOD(String companyName, String dateCreation, String bulstat, String ownerName, int startingCapital, int currentCapital, int annualIncome) {
        super(companyName, dateCreation, bulstat, ownerName, startingCapital, currentCapital, annualIncome);
    }
}
private int annualExpenses;
private int ownerProperty;

    private void setAnnualExpenses(int annualExpenses) {
        if (CompanyEOOD.this.companyName != null) {
            if (CompanyEOOD.this.dateCreation != null) {
                if (CompanyEOOD.this.bulstat != null) {
                    if (CompanyEOOD.this.ownerName != null) {
                        if (CompanyEOOD.this.startingCapital > 0) {
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
                    if (this.ownerName != null) {
                        if (this.startingCapital > 0) {
                            this.ownerProperty = ownerProperty;
                        }
                    }
                }
            }
        }
    }

    private int getAnnualExpenses() {
        return annualExpenses;
    }

    private int getOwnerProperty() {
        return ownerProperty;
    }

    @Override
    public double calculateCapitalIncrease() {
        if (this.companyName == null) {
            if (this.dateCreation == null) {
                if (this.bulstat == null) {
                    if (ownerName == null) {
                        if (this.startingCapital <= 0) {
                            return 0.00;
                        }
                    }
                }
            }
        }
        return super.calculateCapitalIncrease() - ownerProperty;
    }

    @Override
    public double calculateProfit() {
        if (this.companyName == null) {
            if (this.dateCreation == null) {
                if (this.bulstat == null) {
                    if (ownerName == null) {
                        if (this.startingCapital <= 0) {
                            return 0.00;
                        }
                    }
                }
            }
        }
        return annualIncome - annualExpenses;
    }

}

