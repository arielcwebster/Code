import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class ChatBot
{
	HashMap<Query, Query> memory = new HashMap<Query, Query>();
	
	public ChatBot()
	{
		
	}
	
	public String reply(String input)
	{
		Query query = new Query(input);
		Set<Query> queries = memory.keySet();
		int maxSim = 0;
		Query maxQuery = new Query("");
		
		for(Query q: queries)
		{
			int sim = query.similarity(q);
			if(sim > maxSim)
			{
				maxQuery = q;
				maxSim = sim;
			}
		}
		
		return memory.get(maxQuery).getSentence();
	}
	
	public void train(String s1, String s2)
	{
		memory.put(new Query(s1), new Query(s2));
	}
	
	public void saveMemory()
	{
		try
		{
			FileWriter file = new FileWriter("Memory.txt");
			
			for(Query q: memory.keySet())
			{
				file.append(q.getSentence() + "\t" + memory.get(q).getSentence() + "\n");
			}
			
			file.close();
		}
		catch(Exception e)
		{
			System.out.println("No.");
		}
	}
	/*
	public void readMemory()
	{
		try
		{
			Scanner scan = new Scanner(new File("Memory.txt"));
			String line;
			String[] interaction;
			
			while(scan.hasNext())
			{
				line = scan.nextLine();
				interaction = line.split("\t");
				memory.put(new Query(interaction[0]), new Query(interaction[1]));
			}
		}
		catch(Exception e)
		{
			System.out.println("Hey. Stop that.");
		}
	}*/
}
