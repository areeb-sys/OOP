import java.security.SecureRandom;

public class Craps
{
	private static final SecureRandom randomNumber = new SecureRandom();
	
	private enum Status {CONTINUE , WON , LOST};
	
	private static final int SNAKE_EYE = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_ELEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[] args)
	{
		
		
		
		int face = 1 + randomNumber.nextInt(6);
		
		
		int myPoint = 0;
		Status gameStatus;
		int counter = 0;
		int gamblingWins = 0;
		int casinoWins = 0;
		int countgam = 0;
		int countcas = 0;
		int gamblerWins = 0;
		int CasinooWins = 0;
		int GamblersMon = 0;
		int CasinoMon = 0;
		
		
		for(int i = 1 ; i <= 9000000 ; i++)
		{
		
		int sumOfMoney = Amount();
		int sumOfDice = rollDice();
		switch(sumOfDice)
		{
			case SEVEN:
			case YO_ELEVEN:
				gameStatus = Status.WON;
				countgam ++;
				GamblersMon = GamblersMon + sumOfMoney;
				CasinoMon = CasinoMon - sumOfMoney;
				break;
				
			case SNAKE_EYE:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				countcas ++;
				CasinoMon = CasinoMon + sumOfMoney;
				GamblersMon = GamblersMon - sumOfMoney;
				
				break;
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				break;
		}
		
		
		while (gameStatus == Status.CONTINUE)
		{
			sumOfDice = rollDice();
			
			if(sumOfDice == myPoint)
			{
				gameStatus = Status.WON;
				gamblingWins++;
				GamblersMon = GamblersMon + sumOfMoney;
				CasinoMon = CasinoMon - sumOfMoney;
				
			}
			else
				if(sumOfDice == SEVEN)
				{
					gameStatus = Status.LOST;
					casinoWinswins++;
					CasinoMon = CasinoMon + sumOfMoney;
					GamblersMon = GamblersMon - sumOfMoney;
					
				}
		}
		    gamblerWins = (countgam + gamblingWins);
		    CasinoWins = (countcas + casinoWins);  
		
			if(gameStatus == Status.WON){}
				
			else
			{}
		
				
		}
				System.out.printf("1)Gambler wins %d times,Casino wins %d times %n2)First Roll wins for gambler : %d%n3)First Roll wins for Casino : %d",gamblerWins,CasinoWins,countgam,countcas);
				System.out.printf("%n4)Gambler has Rs %d%n5)Casino has Rs %d",GamblersMon,CasinoMon);
	}
		
		public static int rollDice()
		{
			int die1 = 1 + randomNumber.nextInt(6);
			int die2 = 1 + randomNumber.nextInt(6);
			
			int sum = die1 + die2;
			
			
			return sum;
		}
		
		public static int Amount()
		{
			int money = 50 + randomNumber.nextInt(100);
			
			
			
			
			
			return money;
		}
}
	