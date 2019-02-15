

function randomcharacter()
{
var ran1 = document.getElementById("rannumber1").innerHTML = Math.floor(Math.random() * 10) + 1;
var ran2  = document.getElementById("rannumber2").innerHTML = Math.floor(Math.random() * 13) + 1;
var ran3 = document.getElementById("rannumber3").innerHTML = Math.floor(Math.random() * 10) + 1;



if (ran1 === 1)
{
	document.getElementById('name').value = "John";
}
else if (ran1 === 2)
{
	document.getElementById('name').value = "Greg";
}
else if (ran1 === 3)
{
	document.getElementById('name').value = "Richard";
} 
else if (ran1 === 4)
{
	document.getElementById('name').value = "Susan";
}
else if (ran1 === 5)
{
	document.getElementById('name').value = "Tiffany";
} 
else if (ran1 === 6)
{
	document.getElementById('name').value = "Gwen";
}
else if (ran1 === 7)
{
	document.getElementById('name').value = "Namfuddle";
} 
else if (ran1 === 8)
{
	document.getElementById('name').value = "Rahoon";
}
else if (ran1 === 9)
{
	document.getElementById('name').value = "KLARK";
} 
else if (ran1 > 9)
{
	console.log("boop");
}

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
var racestr =1;
var racedex = 1;
var racesmart =1;
var racevigor = 1;
var racecha = 1;

var classstr = 1;
var classdex = 1;
var classsmart =1;
var classvigor = 1;
var classcha = 1;

var race = document.getElementById('race');

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

var clazz = document.getElementById('class');
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

	var strengthtotal = racestr + classstr;
	var dextotal = racedex + classdex;
	var smarttotal = racesmart + classsmart;
	var vigortotal = racevigor + classvigor;
	var chatotal = racecha + classcha;


var strength = document.getElementById('Strength');
	strength.innerHTML = strengthtotal;
	var dex = document.getElementById('Dex');
	dex.innerHTML = dextotal;
	var smart = document.getElementById('Smart');
	smart.innerHTML = smarttotal;
	var vigor = document.getElementById('Vigor');
	vigor.innerHTML = vigortotal;
	var cha = document.getElementById('Cha');
	cha.innerHTML = chatotal;
}