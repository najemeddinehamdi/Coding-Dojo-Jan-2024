const pokémon = Object.freeze([
        { "id": 1,   "name": "Bulbasaur",  "types": ["poison", "grass"] },
        { "id": 5,   "name": "Charmeleon", "types": ["fire"] },
        { "id": 9,   "name": "Blastoise",  "types": ["water"] },
        { "id": 12,  "name": "Butterfree", "types": ["bug", "flying"] },
        { "id": 16,  "name": "Pidgey",     "types": ["normal", "flying"] },
        { "id": 23,  "name": "Ekans",      "types": ["poison"] },
        { "id": 24,  "name": "Arbok",      "types": ["poison"] },
        { "id": 25,  "name": "Pikachu",    "types": ["electric"] },
        { "id": 37,  "name": "Vulpix",     "types": ["fire"] },
        { "id": 52,  "name": "Meowth",     "types": ["normal"] },
        { "id": 63,  "name": "Abra",       "types": ["psychic"] },
        { "id": 67,  "name": "Machamp",    "types": ["fighting"] },
        { "id": 72,  "name": "Tentacool",  "types": ["water", "poison"] },
        { "id": 74,  "name": "Geodude",    "types": ["rock", "ground"] },
        { "id": 87,  "name": "Dewgong",    "types": ["water", "ice"] },
        { "id": 98,  "name": "Krabby",     "types": ["water"] },
        { "id": 115, "name": "Kangaskhan", "types": ["normal"] },
        { "id": 122, "name": "Mr. Mime",   "types": ["psychic"] },
        { "id": 133, "name": "Eevee",      "types": ["normal"] },
        { "id": 144, "name": "Articuno",   "types": ["ice", "flying"] },
        { "id": 145, "name": "Zapdos",     "types": ["electric", "flying"] },
        { "id": 146, "name": "Moltres",    "types": ["fire", "flying"] },
        { "id": 148, "name": "Dragonair",  "types": ["dragon"] }
    ]);

    class Entity {
        constructor(id){
            this.id = id ;
            this.HP = 100;
        }
        attack(target){
            target.HP -= 20 
        }
    }
    
    class Pokemon  extends Entity{
        constructor(id , name , types){
            super(id);
            this.name = name ; 
            this.types = types;
            
        }

        attack(target){
            super.attack(target)
            console.log(this.name + "attacked"  + target.name + " for 20 points , it's HP are now " + target.HP)
        }
        
    }

const allPokemen = []
for(let i=0 ; i<pokémon.length ; i++){
        allPokemen.push(new Pokemon(pokémon[i].id, pokémon[i].name, pokémon[i].types))
    }

    // console.log(allPokemen)

    allPokemen[0].attack(allPokemen[1])

    //an array of pokémon objects where the id is evenly divisible by 3
    const divisbleBy3 = allPokemen.filter(p =>p.idù3==0)
    console.log(divisbleBy3)


    //an array of pokémon objects that are "fire" type
    const fireType = allPokemen.filter(p=>p.types.includes("fire"))
    console.log(fireType)

    //an array of pokémon objects that have more than one type
    const multiTypes = allPokemen.filter( p => p .types.length>1)
    console.log(multiTypes)

    //an array with just the names of the pokémon

    const names = allPokemen.map(p=>p.name)
    console.log(names)

    //an array with just the names of pokémon with an id greater than 99

    const namesGreater99 = allPokemen.filter(p =>p.id > 99 ).map(p=>p.name)
    console.log(namesGreater99);

    //an array with just the names of the pokémon whose only type is poison
    const poisonTypes = allPokemen.filter(p=>p.types.length==1 && p.types == "poison").map(p=>p.name)
    console.log(poisonTypes);

    //an array with just the names of the pokémon whose only type is poison
    const flyingType = allPokemen.filter(p=>p.types[1]=="flying").map(p=>p.types[0])
    console.log(flyingType);

    //a count of the number of pokémon that are "normal" type
    const normalCount = allPokemen.filter(p=>p.types.includes("normal")).length
    console.log(normalCount);
