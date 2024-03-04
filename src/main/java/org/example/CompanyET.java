package org.example;

public class CompanyET extends Company {
    public String ownerName;
    public int startingCapital;
    public int currentCapital;
    public int annualIncome;
    private double legalExpense = 0.10;

    public CompanyET(String companyName, String dateCreation, String bulstat, String ownerName, int startingCapital,
                     int currentCapital, int annualIncome) {
        super(companyName, dateCreation, bulstat);
        setOwnerName(ownerName);
        setStartingCapital(startingCapital);
        setCurrentCapital(currentCapital);
        setAnnualIncome(annualIncome);
    }

    void setOwnerName(String ownerName) {
        if (this.companyName != null) {
            if (this.dateCreation != null) {
                if (this.bulstat != null) {
                    if (ownerName == "") {
                        System.out.println("Incorrect owner name. Company would not be saved.");
                    } else {
                        this.ownerName = ownerName;
                    }
                }
            }
        }
    }

    private void setStartingCapital(int startingCapital) {
        if (this.companyName != null) {
            if (this.dateCreation != null) {
                if (this.bulstat != null) {
                    if (ownerName != null) {
                        if (startingCapital > 0) {
                            this.startingCapital = startingCapital;
                        } else {
                            System.out.println("Incorrect starting capital. Company would not be saved.");
                            }
                    }
                }
            }
        }
    }

    private void setCurrentCapital(int currentCapital) {
        if (this.companyName != null) {
            if (this.dateCreation != null) {
                if (this.bulstat != null) {
                    if (this.ownerName != null) {
                        if (this.startingCapital > 0) {
                            this.currentCapital = currentCapital;
                        }
                    }
                }
            }
        }
    }

    void setAnnualIncome(int annualIncome) {
        if (this.companyName != null) {
            if (this.dateCreation != null) {
                if (this.bulstat != null) {
                    if (this.ownerName != null) {
                        if (this.startingCapital > 0) {
                            this.annualIncome = annualIncome;
                        }
                    }
                }
            }
        }
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getStartingCapital() {
        return startingCapital;
    }

    public int getCurrentCapital() {
        return currentCapital;
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

        return currentCapital - startingCapital;
    }

    @Override
    public double calculateProfit() {
        if (this.companyName == null) {
            if (this.dateCreation == null) {
                if (this.bulstat == null) {
                    if (this.ownerName == null) {
                        if (this.startingCapital <= 0) {
                            return 0.00;
                        }
                    }
                }
            }
        }
        return annualIncome * (1 -  legalExpense );
    }
}

