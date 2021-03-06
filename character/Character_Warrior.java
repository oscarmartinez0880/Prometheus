package character;
/*This is the sub class for the warrior_Class. 
 * This is where I add some return statements. */
public class Character_Warrior extends Character_Class {
	
	// NEW CONSTRUCTOR:
	
		public Character_Warrior() {
			super.name = "Warrior";
			super.health = 100;
			super.magic = 20;
			super.armor = 50;
			super.speed = 70;
			super.strength = 60;
			super.resistance = 60;
		}
		
		// END NEW CONSTRUCTOR.
		
		public void levelUp(int exp1) {
			exp = exp1;
			while(exp >= MAX_EXP) {
				if(getLevel() >= 10) {
					break;
				}
				else{
					exp -= MAX_EXP;
					if(exp < 0) {
						exp = 0;
					}
					level++;
					MAX_EXP += 50;
					health += 15;
					health = getHealth();
					armor += 10;
					magic += 1;
					speed += 3;
					strength += 7;
					resistance += 12;
					System.out.println("You have leveled up!");
				}
			}
		}
		
		public String getSpeak(){
			return "I am a Warrior";
		}
		
		public String getSpeak2(){
			return "I do: ";
		}
		
		public String getSpeak3(){
			return "I have: ";
		}
	
}
