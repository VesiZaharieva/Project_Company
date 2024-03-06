package org.example;

public class CompanyEOOD extends CompanyET {

  public CompanyEOOD(String companyName, String dateCreation, String bulstat, String ownerName, int startingCapital, int currentCapital, int annualIncome, int annualExpenses, int ownerProperty) {
        super(companyName, dateCreation, bulstat, ownerName, startingCapital, currentCapital, annualIncome);
    }
private int annualExpenses;
private int ownerProperty;
private int capIncrease;

    private void setAnnualExpenses(int annualExpenses) {
       // if (!getCompanyName().equals(null)) {
            //if (!getDateCreation().equals(null)) {
               // if (!getBulstat().equals(null)) {
                   // if (!getOwnerName().equals(null)) {
//if (getStartingCapital() > 0) {
                            this.annualExpenses = annualExpenses;
                        }
                   // }
               // }
           // }
       // }
    //}

    private void setOwnerProperty(int ownerProperty) {
        //if (!getCompanyName().equals(null)) {
           // if (!getDateCreation().equals(null)) {
               // if (!getBulstat().equals(null)) {
                   // if (!getOwnerName().equals(null)) {
                        //if (getStartingCapital() > 0) {
                            this.ownerProperty = ownerProperty;
                        }
                   // }
                //}
           // }
       // }
   // }

    private int getAnnualExpenses() {
        return this.annualExpenses;
    }

    private int getOwnerProperty() {
        return this.ownerProperty;
    }

    @Override
    public double calculateCapitalIncrease() {
        //if (getCompanyName().equals(null)) { return 0.00; } else {
            //if (getDateCreation().equals(null)) { return 0.00; } else {
               // if (getBulstat().equals(null)) { return 0.00; } else {
                   // if (getOwnerName().equals(null)) { return 0.00; } else {
                       // if (getStartingCapital() <= 0) {
                          //  return 0.00;
                      //  }
                   // }
                //}
           // }
       // }
        return super.calculateCapitalIncrease() - getOwnerProperty();
    }

    @Override
    public double calculateProfit() {
       // if (getCompanyName().equals(null)) { return 0.00; } else {
            //if (getDateCreation().equals(null)) { return 0.00; } else {
               // if (getBulstat().equals(null)) { return 0.00; } else {
                    //if (getOwnerName().equals(null)) { return 0.00; } else {
                       // if (getStartingCapital() <= 0) {
                          //  return 0.00;
                       // }
                   // }
               // }
           // }
       // }
        return getAnnualIncome() - getAnnualExpenses();

    }

}

