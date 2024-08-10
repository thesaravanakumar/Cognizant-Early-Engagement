public class Loan {
    private int loanId;
    private String accHolderName;
    private String loanType;
    private float rateOfInterest;
    private float tenureOfLoan;

    public Loan(int loanId, String accHolderName, String loanType, float rateOfInterest, float tenureOfLoan) {
        this.loanId = loanId;
        this.accHolderName = accHolderName;
        this.loanType = loanType;
        this.rateOfInterest = rateOfInterest;
        this.tenureOfLoan = tenureOfLoan;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public float getTenureOfLoan() {
        return tenureOfLoan;
    }

    public void setTenureOfLoan(float tenureOfLoan) {
        this.tenureOfLoan = tenureOfLoan;
    }
}
