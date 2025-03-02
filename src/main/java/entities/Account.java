package entities;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    // CONSTRUCTORS
    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    // GETTERS AND SETTERS


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    // METHODS

    public void withdraw(Double amount) {
        this.balance -= amount;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

}
