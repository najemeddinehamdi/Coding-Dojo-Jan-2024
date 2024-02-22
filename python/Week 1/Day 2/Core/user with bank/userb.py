
class BankAccount:
    def __init__(self):
        self.balance = 0

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        self.balance -= amount

class User:
    def __init__(self, name):
        self.name = name
        self.account = BankAccount()

    def make_deposit(self, amount):
        self.account.deposit(amount)
        return self

    def make_withdrawal(self, amount):
        self.account.withdraw(amount)
        return self

    def display_user_balance(self):
        print(f"{self.name}'s balance: {self.account.balance}")
        return self


user = User("najem")

user.make_deposit(100).make_deposit(50).make_withdrawal(30)

user.display_user_balance()

