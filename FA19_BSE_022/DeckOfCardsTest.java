// Author : Areeb Ahmed FA19_BSE_022

public class DeckOfCardsTest
{
	public static void main(String[] args)
	{
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		
		
		int order = 0;
		int test = 0;
		do
		{
			myDeckOfCards.shuffle();
			test++;
			order = myDeckOfCards.ace_Sh();
		}while(order != 4);
		
		for (int i = 1; i <= 52; i++)
		{
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			if (i%4 == 0)
			{
				System.out.println();
			}
		}
		System.out.println();
		System.out.printf("%nShuffles are : %d", test);
	}
	
	
}