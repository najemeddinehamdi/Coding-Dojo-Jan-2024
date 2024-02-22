class user:
    def __init__(self,firstname,lastname,email,age):
        self.firstname=firstname
        self.lastname=lastname
        self.email=email
        self.age=age
        self.is_reward_member = False
        self.gold_card_point= 0
        
    def display_info(self):
        print(f"firstname:{self.firstname}")
        print(f"lastname:{self.lastname}")
        print(f"email:{self.email}")
        print(f"age:{self.age}")
        print(f"member:{self.is_reward_member}")
        print(f"current point:{self.gold_card_point}")


    def enroll(self):
        self.is_reward_member=True
        self.gold_card_point=200


    
    def spendPoint(self,amount):
        self.gold_card_point -= amount




user=user("najemeddine","Hamdi","user@gmail.com",15)
user.enroll()
user.display_info()
user.spendPoint(50)