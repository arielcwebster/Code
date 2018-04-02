
public class Query
{
	String sentence;
	
	public Query(String iSentence)
	{
		sentence = iSentence;
	}
	
	public int similarity(Query other)
	{
		String[] s1 = sentence.split(" ");
		String[] s2 = other.getSentence().split(" ");
		
		int similarity = 0;
		
		for(String word1: s1)
			for(String word2: s2)
				if(word1.equalsIgnoreCase(word2))
					similarity++;
		
		return similarity;
	}
	
	public String getSentence()
	{
		return sentence;
	}
}
