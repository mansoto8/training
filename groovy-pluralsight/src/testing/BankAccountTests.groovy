package testing

import groovy.test.GroovyTestCase
import groovy.mock.interceptor.*

class BankAccountTests extends GroovyTestCase
{
  def void testCanDepositMoney() {
    def account = new BankAccount(10)
    account.deposit(5)
    assert 15 == account.balance
  }

  def void testWithdrawn() {
    def account = new BankAccount(10)
    shouldFail {
      account.withdraw(100)
    }
  }

  def void testCanAccrueInterest() {
    def account = new BankAccount(10)
    //It is better MockFor -> Throws exception if mock is not called
    def service = new StubFor(InterestRateService)
    service.demand.getInterestRate {
      return 0.10
    }

    service.use {
      account.accrueInterest()

      assert 11 == account.balance
    }
  }
}
