import java.util.Scanner;
public class ModulousChallenges {






	public static void main(String[] args)

	{
		LeapYear();
		ThirdNum();
		Print100();
	}

	public static void LeapYear()
	{

		Scanner userInput = new Scanner (System.in);

		System.out.println("											");
		System.out.println("Enter a year to check if it is leap year");
		int years = userInput.nextInt();

		if (years % 4 == 0)
		{
			if(years % 100 == 0) 
			{
				if(years % 400 == 0)
				{
					System.out.println("This is a leap year");
				}
				else
				{
					System.out.println("This is not a leap year");
				}
			}
			else
			{
				System.out.println("This is a leap year");
			}
		}
		else
		{
			System.out.println("This is not a leap year");
		}
	}

	public static void ThirdNum()
	{
		System.out.println("												");
		int items[] = {2,4,6,8,10,12,14,16,18,20};


		for(int i = 0; i < items.length; i++)
		{

			if ((i + 1) % 3 == 0)
			{
				System.out.println(items[i]);
			}
		}

	}

	public static void Print100()
	{
		for(int i = 1; i < 101; i++)
		{
			if (i % 3 == 0)
			{
				if (i % 5 == 0)
				{
					System.out.println("FizzBuzz");
				}
				else
				{
					System.out.println("Fizz");
				}
				
			}
			else if (i % 5 == 0)
			{
				System.out.println("Buzz");
			}
			else 
			{
				System.out.println(i);
			}
		}
	}




}
