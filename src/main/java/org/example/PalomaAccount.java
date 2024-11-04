package org.example;

public class PalomaAccount {

    private String accountId;
    private Double balance;

    public PalomaAccount(String accountId, Double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public Double getBalance() {
        return balance;
    }


    // Creo un método para addQuantity
    public Double addQuantity(double quantity){
        if (quantity <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
        balance += quantity;
        return balance;
    }
}
