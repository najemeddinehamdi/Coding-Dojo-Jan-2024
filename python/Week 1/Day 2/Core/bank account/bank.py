class BankAccount :
    def __init__(self,int_rate,balance):
        self.int_rate=int_rate
        self.balance=balance    
    def deposit(self, amount):
        self.balance += amount
        print(self.balance)
    def withdraw(self, amount):
        if amount <= 0 :
            print("Insufficient funds: Charging a $5 fee and deduct $5")
            self.balance -= 5
        else:  
            self.balance -= amount
            print(self.balance)
    def display_account_info(self):
        print(self.balance)
    def yield_interest(self):
        if self.balance>=0:
            self.balance+=self.balance*(self.int_rate/100)
            print(self.balance)
account1 = BankAccount(5, 100)

account1.deposit(50)
account1.deposit(30)
account1.deposit(20)
account1.withdraw(40)
account1.yield_interest()
account1.display_account_info()


account2 = BankAccount(5, 200)

account2.deposit(100)
account2.deposit(50)
account2.withdraw(20)
account2.withdraw(30)
account2.withdraw(40)
account2.withdraw(10)
account2.yield_interest()
account2.display_account_info()