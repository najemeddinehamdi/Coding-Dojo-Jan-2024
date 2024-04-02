class Ninja{
    constructor(name){
        this.name=name;
        this.health=90;
        this.speed=3;
        this.strength=90;
    }
    sayName(){
        console.log(`the name is : ${this.name}`)
    }
    showStats(){
        console.log(`name:${this.name}, health:${this.health},speed:${this.speed},strenght:${this.strength} `)
    }
    drinkshake(){
        this.health+=10;
    }

}

class Sensei extends Ninja{
    constructor(name){
        super(name)
        this.wisdom=10;
    }
    speakwisdom(){
        console.log("what one programmer can do in one month, two programmer can do in two month")
    }
}

const ninja1 = new Ninja("Hyabusa");
ninja1.sayName();
ninja1.drinkshake();
ninja1.showStats();
const superSensei = new Sensei("Master Splinter");
superSensei.speakwisdom();
superSensei.showStats();

