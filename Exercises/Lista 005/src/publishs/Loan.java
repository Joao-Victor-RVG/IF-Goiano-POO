package publishs;

import java.util.Date;

public class Loan {
    private int id;
    private String user;
    private String publication;
    private Date loanDate;
    private Date returnDate;
    private int renewalsQuantity;
    private double fineValue;
    private int maxRenewals = 3;

    public Loan(int id, String user, String publication, Date loanDate, double fineValue) {
        this.id = id;
        this.user = user;
        this.publication = publication;
        this.loanDate = loanDate;
        this.returnDate = new Date(loanDate.getTime() + 7 * 24 * 60 * 60 * 1000);
        this.renewalsQuantity = 0;
        this.fineValue = fineValue;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getRenewalsQuantity() {
        return renewalsQuantity;
    }

    public void setRenewalsQuantity(int renewalsQuantity) {
        this.renewalsQuantity = renewalsQuantity;
    }

    public double getFineValue() {
        return fineValue;
    }

    public void setFineValue(double fineValue) {
        this.fineValue = fineValue;
    }

    public void renewLoan() {
        if (renewalsQuantity < maxRenewals) {
            renewalsQuantity++;
            returnDate = new Date(returnDate.getTime() + 7 * 24 * 60 * 60 * 1000); // updates return date to 7 days after the last renewal
            System.out.println("Loan renewed successfully!");
        } else {
            System.out.println("Renewal limit reached!");
        }
    }


    public double calculateFine() {
        Date today = new Date();
        long daysLate = (today.getTime() - returnDate.getTime()) / (24 * 60 * 60 * 1000);
        if (daysLate > 0) {
            return daysLate * fineValue;
        } else {
            return 0;
        }
    }
}
