class Hand:
    def __init__(self,name,hidden=False):
        self.name=name
        self.cards=[]
        self.hidden=hidden


    def addcard(self,deck):
        self.cards.append(deck.getcard())

    def displaycards(self):
        print("The " + self.name,"has:")
        if self.hidden==True:
            self.cards[0].card_info()
            print("hidden card")
        else:
            for c in self.cards:
                c.card_info()
        print("total:",self.sum())
        print("------")


    def sum(self):
        s=0
        for c in self.card :
            s+= c.point_val    
        
        for c in self.cards:
            if c.point_val==11 and s>21 :
                s-=10
        return s        