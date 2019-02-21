'use strict'

function submitCharacterButton()
{
	 let xhr = new XMLHttpRequest();
        xhr.open("POST", "api/Player/createPlayer");
        xhr.onload = () => 
		{
            document.write(xhr.responseText);
        }
        xhr.send();
}

function loadAllCharacters()
{
	let textwords = document.getElementById("temptext").value;
 let xhr = new XMLHttpRequest();
		xhr.withcredentials=true;
        xhr.open("GET",  "http://localhost:8080/individual_Project/api/Player/getAllPlayers");
        xhr.onload = () => {
			let temp = xhr.responseText;
			temp = JSON.parse(temp);
			temp = JSON.stringify(temp);
			
			let wordnice = xhr.responseText.replace('['," ");
			wordnice = wordnice.replace(']'," ");
			wordnice = wordnice.replace(/{/g," ");
			wordnice = wordnice.replace(/}/g,"<br/>");
			wordnice = wordnice.replace(/\"/g," ");
			wordnice = wordnice.replace(/,/g,"<br/>");

			document.getElementById('temptext').innerHTML = wordnice;
			console.log(wordnice);
        }
        xhr.send();
}

function randomCharacter()
{
let rand1 = document.getElementById("rannumber1").innerHTML = Math.floor(Math.random() * 10) + 1;
let ran2  = document.getElementById("rannumber2").innerHTML = Math.floor(Math.random() * 13) + 1;
let ran3 = document.getElementById("rannumber3").innerHTML = Math.floor(Math.random() * 10) + 1;

let names = ['John', 'Greg', 'Richard','Simon','Kleg','Nakgu','Susan','Amy','Azura','Vinncento','Gwen']
document.getElementById('name').value = names[rand1];


document.getElementById('class').selected = 'true';

if (ran2 === 1)
{
	document.getElementById('DragonBorn').selected = "true";
}
else if (ran2 === 2)
{
	document.getElementById('Dwarf').selected = "true";
}
else if (ran2 === 3)
{
	document.getElementById('Elf').selected = "true";
} 
else if (ran2 === 4)
{
	document.getElementById('Gnome').selected = "true";
}
else if (ran2 === 5)
{
	document.getElementById('Half-Elf').selected = "true";
} 
else if (ran2 === 6)
{
	document.getElementById('Half-Orc').selected = "true";
}
else if (ran2 === 7)
{
	document.getElementById('Halfling').selected = "true";
} 
else if (ran2 === 8)
{
	document.getElementById('Human').selected = "true";
}
else if (ran2 === 9)
{
	document.getElementById('Tiefling').selected = "true";
} 
else if (ran2 > 9)
{
	console.log("boop");
}

if (ran3 === 1)
{
	document.getElementById('Barbarian').selected = "true";
}
else if (ran3 === 2)
{
	document.getElementById('Bard').selected = "true";
}
else if (ran3 === 3)
{
	document.getElementById('Cleric').selected = "true";
} 
else if (ran3 === 4)
{
	document.getElementById('Druid').selected = "true";
}
else if (ran3 === 5)
{
	document.getElementById('Fighter').selected = "true";
} 
else if (ran3 === 6)
{
	document.getElementById('Monk').selected = "true";
}
else if (ran3 === 7)
{
	document.getElementById('Paladin').selected = "true";
} 
else if (ran3 === 8)
{
	document.getElementById('Ranger').selected = "true";
}
else if (ran3 === 9)
{
	document.getElementById('Rouge').selected = "true";
} 
else if (ran3 === 10)
{
	document.getElementById('Sorcerer').selected = "true";
} 
else if (ran3 === 11)
{
	document.getElementById('Warlock').selected = "true";
}
else if (ran3 === 12)
{
	document.getElementById('Wizard').selected = "true";
} 
else
{
	console.log("boop");
}

displayScore();
}

function displayScore() 
{
let racestr =1;
let racedex = 1;
let racesmart =1;
let racevigor = 1;
let racecha = 1;

let classstr = 1;
let classdex = 1;
let classsmart =1;
let classvigor = 1;
let classcha = 1;

let race = document.getElementById('race');

if (race.options[race.selectedIndex].text === "DragonBorn")
{
	racestr =1;
	racedex = 0;
	racesmart =0;
	racevigor = 0;
	racecha = 2;
}
if (race.options[race.selectedIndex].text === "Dwarf")
{
	racestr =1;
	racedex = 0;
	racesmart =0;
	racevigor = 2;
	racecha = 0;
}
if (race.options[race.selectedIndex].text === "Elf")
{
	racestr =0;
	racedex = 2;
	racesmart =1;
	racevigor = 0;
	racecha = 0;
}
if (race.options[race.selectedIndex].text === "Gnome")
{
	racestr =0;
	racedex = 1;
	racesmart =2;
	racevigor = 0;
	racecha = 0;
}
if (race.options[race.selectedIndex].text === "Half-Elf")
{
	racestr =1;
	racedex = 1;
	racesmart =0;
	racevigor = 0;
	racecha = 2;
}
if (race.options[race.selectedIndex].text === "Half-Orc")
{
	racestr =2;
	racedex = 0;
	racesmart =0;
	racevigor = 1;
	racecha = 0;
}
if (race.options[race.selectedIndex].text === "Halfling")
{
	racestr = 0;
	racedex = 2;
	racesmart = 0;
	racevigor = 0;
	racecha = 1;
}
if (race.options[race.selectedIndex].text === "Human")
{
	racestr =1;
	racedex = 1;
	racesmart =1;
	racevigor = 1;
	racecha = 1;
}
if (race.options[race.selectedIndex].text === "Tiefling")
{
	racestr = 0;
	racedex = 0;
	racesmart = 1;
	racevigor = 0;
	racecha = 2;
}

let clazz = document.getElementById('class');
if (clazz.options[clazz.selectedIndex].text === "Barbarian")
{
	classstr = 2;
	classdex = 0;
	classsmart = 0;
	classvigor = 2;
	classcha = 0;
}
if (clazz.options[clazz.selectedIndex].text === "Bard")
{
	classstr = 0;
	classdex = 2;
	classsmart = 0;
	classvigor = 0;
	classcha = 2;
}
if (clazz.options[clazz.selectedIndex].text === "Cleric")
{
	classstr = 1;
	classdex = 0;
	classsmart = 0;
	classvigor = 1;
	classcha = 2;
}
if (clazz.options[clazz.selectedIndex].text === "Druid")
{
	classstr = 0;
	classdex = 1;
	classsmart = 2;
	classvigor = 1;
	classcha = 0;
}
if (clazz.options[clazz.selectedIndex].text === "Fighter")
{
	classstr = 2;
	classdex = 1;
	classsmart = 0;
	classvigor = 1;
	classcha = 0;
}
if (clazz.options[clazz.selectedIndex].text === "Monk")
{
	classstr = 0;
	classdex = 2;
	classsmart = 1;
	classvigor = 1;
	classcha = 0;
}
if (clazz.options[clazz.selectedIndex].text === "Paladin")
{
	classstr = 1;
	classdex = 0;
	classsmart = 0;
	classvigor = 1;
	classcha = 2;
}
if (clazz.options[clazz.selectedIndex].text === "Ranger")
{
	classstr = 0;
	classdex = 2;
	classsmart = 0;
	classvigor = 1;
	classcha = 1;
}
if (clazz.options[clazz.selectedIndex].text === "Rouge")
{
	classstr = 0;
	classdex = 2;
	classsmart = 1;
	classvigor = 0;
	classcha = 1;
}
if (clazz.options[clazz.selectedIndex].text === "Sorcerer")
{
	classstr = 0;
	classdex = 1;
	classsmart = 1;
	classvigor = 0;
	classcha = 2;
}
if (clazz.options[clazz.selectedIndex].text === "Warlock")
{
	classstr = 0;
	classdex = 1;
	classsmart = 0;
	classvigor = 1;
	classcha = 2;
}
if (clazz.options[clazz.selectedIndex].text === "Wizard")
{
	classstr = 0;
	classdex = 1;
	classsmart = 2;
	classvigor = 0;
	classcha = 1;
}

	let strengthtotal = racestr + classstr;
	let dextotal = racedex + classdex;
	let smarttotal = racesmart + classsmart;
	let vigortotal = racevigor + classvigor;
	let chatotal = racecha + classcha;


let strength = document.getElementById('Strength');
	strength.innerHTML = strengthtotal;
	let dex = document.getElementById('Dex');
	dex.innerHTML = dextotal;
	let smart = document.getElementById('Smart');
	smart.innerHTML = smarttotal;
	let vigor = document.getElementById('Vigor');
	vigor.innerHTML = vigortotal;
	let cha = document.getElementById('Cha');
	cha.innerHTML = chatotal;
}