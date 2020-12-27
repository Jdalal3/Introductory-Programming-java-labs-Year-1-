
public class exercise6b {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		String animal = "";
		int leg_num = 13;
		
		switch (leg_num)
		{
				case 1: case 2: case 4: case 6:
				leg_num = 4;
				System.out.println("(a)n" + " llama, goat, baboon, ocelot " + " has " + 4 + " legs ");
				break;
				case 3: case 7: case 11: case 12: case 14:
				leg_num = 0;
				System.out.println("(b)n" + " cobra, codpaul allen the german octopus, minke whale, lela ");
				break;
				case 5:
				leg_num = 100;
				System.out.println("(c)n" + " centipede " + " has " + 100 + " legs ");
				break;
				case 8:
				leg_num = 2;
				System.out.println("(d)n" + " human " + " has " + 2 + " legs");
				break;
				case 9: case 10:
				leg_num = 8;
				System.out.println("(e)n" + " tarantula, black scorpion " + " has " +  8 + " legs " );
				break;
				case 13:
				leg_num =20;
				System.out.println("(f)n" + " klingon " + " has " + 20 + " legs");
				break;
				default:
				System.out.println("unkown");	
				
		}
	}
}
		

