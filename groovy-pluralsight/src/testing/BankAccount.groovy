package testing

class BankAccount
{
  private balance

  BankAccount(openingBalance) {
    balance = openingBalance
  }

  void deposit(amount) {
    balance += amount
  }

  void withdraw(amount) {
    if(amount>balance) {
      throw new Exception()
    }

    balance -= amount
  }

  def void accrueInterest() {
    def service = new InterestRateService()
    def rate = service.getInterestRate()

    def accruedInterest = balance * rate

    balance += accruedInterest;
  }
}
