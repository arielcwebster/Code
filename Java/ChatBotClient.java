import java.util.Scanner;

public class ChatBotClient
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ChatBot bot = new ChatBot();
		String s1 = "", s2 = "";
		
		//bot.readMemory();
		boolean youBot = true;
		
		/**/
		//for(int i = 0; i < 100; i++)
		while(!(s1.equals("quit")))
		{
			if(youBot)
				System.out.print("You: ");
			else
				System.out.print("Bot: ");
			
			youBot = !youBot;
			
			s2 = scan.nextLine();
			
			bot.train(s1, s2);
			
			s1 = s2;
		}
		
		bot.saveMemory();
		
		/*
		String last = "";
		int counter = 0;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print("You: ");
			s1 = scan.nextLine();
			
			if (last.equals(s1) && counter == 0){
				System.out.print("uh... ");
				counter++;
			} else if (last.equals(s1) && counter == 1){
				System.out.print("we've been over this? I said ...");
				counter++;
			}else if (last.equals(s1) && counter == 2){
				System.out.print("Your just messing with me now :/ ...");
				counter++;
			} else {
				last = s1;
				counter = 0;
			}
			
			System.out.print("Bot: ");
			Sys.tem.outprintln(bot.reply(s1));
			
			if (counter == 3){
				System.out.print("Lets talk about something else");
			}
		}*/
	}

}
