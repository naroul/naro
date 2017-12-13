package hello;

public class Role {
	
	public static int count ;
	public int HP = 1000;
	public int EXP = 0;
	
	
	public static void main(String[] args) {
		Role player1 = new Role();
		Role player2 = new Role();
		player1.fight(player2);
	}
	
	
	public void fight(Role player2) {
		
		for(count = 0;HP >= 0 && player2.HP >= 0;count++) {
			HP--;
			EXP = EXP + 2;
			if(EXP >= 50) {
				HP++;
				EXP = EXP -50;
			}
			player2.HP = player2.HP - 2;
			player2.EXP = player2.EXP +3;
			if(player2.EXP >= 50) {
				player2.HP++;
				player2.EXP = player2.EXP -50;
			}
		}
		if(HP <= 0) {
			System.out.println("player2 won");
			System.out.println("The count of fight is : " + count);
		}
		else {
			System.out.println("player1 won");
			System.out.println("The count of fight is : " + count);
		}
			
	}

}
