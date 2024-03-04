package org.example;

public abstract class Company implements companyPerformance {
    public String companyName;
    public String dateCreation;
    public String bulstat;
    public int startingCapital;

    public Company(String companyName, String dateCreation, String bulstat) {
        setCompanyName(companyName);
        setDateCreation(dateCreation);
        setBulstat(bulstat);
    }



    public void setCompanyName(String companyName) {
        if (companyName == "") {
            System.out.println("Incorrect company name. Company would not be saved.");
            } else {
            this.companyName = companyName;
        }
    }

    public void setDateCreation(String dateCreation) {
        if (this.companyName != null) {
            if (dateCreation == "") {
                System.out.println("Incorrect date of creation. Company would not be saved.");
                } else {
                this.dateCreation = dateCreation;
            }
        }}

        public void setBulstat (String bulstat) {
            if (this.companyName != null) {
                if (this.dateCreation != null) {
                    if (bulstat == "") {
                        System.out.println("Incorrect Bulstat. Company would not be saved.");
                        } else {
                        this.bulstat = bulstat;
                        if (this.bulstat.length() != 10) {
                            System.out.println("Incorrect Bulstat. Company would not be saved.");
                            this.bulstat = null;
                        }
                    }
                }
            }}

            public String getCompanyName() {
                return companyName;
            }

            public String getDateCreation () {
                return dateCreation;
            }

            public String getBulstat () {
                return bulstat;
            }

        }