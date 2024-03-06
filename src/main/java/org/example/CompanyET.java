package org.example;

public class CompanyET extends Company {
    private String ownerName;
    private int startingCapital;
    private int currentCapital;
    private int annualIncome;
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
        //if (!this.getCompanyName().equals(null)) {
            //if (!this.getDateCreation().equals(null)) {
                //if (!this.getBulstat().equals(null)) {
                    if (ownerName.equals("")) {
                        System.out.println("Incorrect owner name. Company would not be saved.");
                    } else {
                        this.ownerName = ownerName;
                    }
                }
           // }
        //}
   // }

    private void setStartingCapital(int startingCapital) {
        //if (!this.getCompanyName().equals(null)) {
           // if (!this.getDateCreation().equals(null)) {
               // if (!this.getBulstat().equals(null)) {
                    //if (this.ownerName.equals(null)) {
                        if (startingCapital > 0) {
                            this.startingCapital = startingCapital;
                        } else {
                            System.out.println("Incorrect starting capital. Company would not be saved.");
                        }
                    }
              //  }
           //}
        //}
    //}

    private void setCurrentCapital(int currentCapital) {
        //if (!this.getCompanyName().equals(null)) {
           //if (!this.getDateCreation().equals(null)) {
                //if (!this.getBulstat().equals(null)) {
                   // if (!this.ownerName.equals(null)) {
                        //if (this.startingCapital > 0) {
                            this.currentCapital = currentCapital;
                        }
                   // }
               // }
           // }
        //}
   // }

    void setAnnualIncome(int annualIncome) {
        //if (!getCompanyName().equals(null)) {
            //if (!getDateCreation().equals(null)) {
                //if (!getBulstat().equals(null)) {
                    //if (!this.ownerName.equals(null)) {
                       // if (this.annualIncome > 0) {
                            this.annualIncome = annualIncome;
                        }
                   // }
                //}
           // }
        //}
   // }

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
        //if (getCompanyName().equals(null)) {
           // return 0.00;
        //} else {
          //  if (this.getDateCreation().equals(null)) {
               // return 0.00;
//} else {
                //if (this.getBulstat().equals(null)) {
                   // return 0.00;
               // } else {
                   // if (this.ownerName.equals(null)) {
                        //return 0.00;
                    //} else {
                        //if (this.startingCapital <= 0) {
                            //return 0.00;
                       // }
                    //}
                //}
            //}
        //}

        return currentCapital - startingCapital;
    }

    @Override
    public double calculateProfit() {
        //if (getCompanyName().equals(null)) { return 0.00;} else {
            //if (getDateCreation().equals(null)) { return 0.00; } else {
             // if (getBulstat().equals(null)) { return 0.00;} else {
                    //if (this.ownerName.equals(null)) { return 0.00;} else {
                       // if (this.startingCapital <= 0) {
                           // return 0.00;
                      //  }
                   // }
               //}
           // }
        //}
        return annualIncome * (1 - legalExpense);
    }
}

