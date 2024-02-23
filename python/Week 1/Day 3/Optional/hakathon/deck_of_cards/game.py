from classes.deck import Deck 
from classes.hand import Hand 

bicycle = Deck()
bicycle.chuffle()
playerhand=Hand("player")
dearlerhand=Hand("dealer", True)

playerhand.addcard(bicycle)
dearlerhand.addcard(bicycle)
playerhand.addcard(bicycle)
dearlerhand.addcard(bicycle)

endgame=False

while endgame==False:
    dearlerhand.displaycards()
    playerhand.displaycards()

    choise=input("do you want to hit, stand or quit [H|S|Q]").lower()
    if choise=="Q":
        print("thank you for playing , good bye")
        endgame=True

    if choise=="H":
        playerhand.addcard(bicycle)
        playerhand.displaycards()
        if playerhand.sum()>21:
            print("player bust")
            endgame=True

if choise=="s":
    dearlerhand.hidden=False
    dearlerhand.displaycards()
    while dearlerhand.sum()<17:
        dearlerhand.addcard(bicycle)
        dearlerhand.displaycards()
        if dearlerhand.sum()>21:
            print("dealer bust")
            endgame=True
        if dearlerhand.sum ()>playerhand.sum():
            print("player win")
        if dearlerhand.sum()== playerhand.sum():
            print("drow")
        endgame==True        
        