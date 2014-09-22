package GameWorld;

public class Weapon {
	public int Damage(){
		int damage = 10;
		int bonus_dmg = 5;
		int damage_all = (Integer) null;
		damage_all = damage + bonus_dmg;
		
		return damage_all;
	}
}
