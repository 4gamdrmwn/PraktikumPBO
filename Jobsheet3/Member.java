package Jobsheet3;

public class Member {
    private String idCardNumber;
    private String name;
    private int loanLimit;
    private int loanAmount;

    public Member(String idCardNumber, String name, int loanLimit) {
        this.idCardNumber = idCardNumber;
        this.name = name;
        this.loanLimit = loanLimit;
        this.loanAmount = 0;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public String getName() {
        return name;
    }

    public int getLimitLoan() {
        return loanLimit;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void borrow(int amount) {
        if (this.loanAmount + amount > this.loanLimit) {
            System.out.println("Sorry, the loan amount exceeds the limit!");
        } else {
            this.loanAmount += amount;
        }
    }

    public void installment(int amount) {
        if (this.loanAmount == 0) {
            System.out.println("You currently have no active loan.");
            return;
        }

        int minInstallment = (int) (0.10 * this.loanAmount);
        if (amount < minInstallment) {
            System.out.println("Sorry, the installment must be 10% of the loan amount");
        } else {
            this.loanAmount -= amount;
            if (this.loanAmount < 0) {
                this.loanAmount = 0;
            }
        }
    }
}