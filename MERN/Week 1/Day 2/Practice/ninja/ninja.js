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

const ninja1 = new Ninja("Hyabusa");
ninja1.sayName();
ninja1.drinkshake();
ninja1.showStats();