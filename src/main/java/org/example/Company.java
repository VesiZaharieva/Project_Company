package org.example;

public abstract class Company implements companyPerformance {
    private String companyName;
    private String dateCreation;
    private String bulstat;

    public Company(String companyName, String dateCreation, String bulstat) {
        setCompanyName(companyName);
        setDateCreation(dateCreation);
        setBulstat(bulstat);
    }
    public void setCompanyName(String companyName) {
        if (companyName.equals("")) {
            System.out.println("Incorrect company name. Company would not be saved.");
            } else {
            this.companyName = companyName;
        }
    }
    public void setDateCreation(String dateCreation) {
        //if (!companyName.equals("")) {
            if (dateCreation.equals("")) {
                System.out.println("Incorrect date of creation. Company would not be saved.");
                } else {
                this.dateCreation = dateCreation;
            }
       // }
        }

        public void setBulstat (String bulstat) {
            //if (!companyName.equals(null)) {
                //if (!dateCreation.equals(null)) {
                    if (bulstat.equals("")) {
                        System.out.println("Incorrect Bulstat. Company would not be saved.");
                        } else {
                        this.bulstat = bulstat;
                        if (this.bulstat.length() != 10) {
                            System.out.println("Incorrect Bulstat. Company would not be saved.");
                            this.bulstat = null;
                        }
                    }
                }
            //}}

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