class Card {
    constructor(name){
        this.name=name;
    }
}

class Unit extends Card{
    constructor(name,cost,power,resiliance){
        super(name);
        this.cost=cost;
        this.power=power;
        this.resiliance=resiliance;
    }
play(target){
    target.resiliance-=this.power;
}
}

class Effect extends Card {
    constructor(name,cost,stat,magnitude){
        super(name);
        this.cost=cost;
        this.stat=stat;
        this.magnitude=magnitude;
    }
play(target){
    if(this.stat=="resiliance"){
        target.resiliance+=this.magnitude;
    }
    else if(this.state=="power"){
        target.power+=this.magnitude;
    }
}

}

const unit=new Unit("Red Belt Ninja",3,3,4);
const unit1=new Unit("Black Belt Ninja",4,5,4);
const effect=new Effect("Hard Algorithm",2,"resiliance",3);
const effect1=new Effect("Unhandled Promise Rejection",1,"resiliance",-2);
const effect2=new Effect("pair Programming",3,"power",2);   

effect.play(unit);
effect1.play(unit);
effect2.play(unit);
unit.play(unit1);