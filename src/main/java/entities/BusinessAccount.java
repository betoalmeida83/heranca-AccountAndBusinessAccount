package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    // CONSTRUCTORS

    public BusinessAccount() {
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    // GETTERS AND SETTERS


    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    // METHODS

    public void loan(Double amount) {
        if(amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
}
