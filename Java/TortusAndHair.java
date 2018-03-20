import java.util.*;
public class TortusAndHair {
	  public static void main(String[] args)
	 {
		  Random rnd = new Random();
		  int i,j,t=1,h=1;
		  char[] race = new char[70];
		  System.out.println("Bang!!!!!");
		  System.out.println("They are off!!!!");
			 while(true)
			 {
				 i = rnd.nextInt(10);
				 j = rnd.nextInt(10);
				 
				 if((1<=i)&&(i<=5))
					t+=3;
				 else if((6<=i)&&(i<=7))
					 t-=6;
				 else if((8<=i)&&(i<=10))
					 t+=1;
				 
				 if((1<=j)&&(j<=2))
						h+=0;
				 else if((3<=j)&&(j<=4))
						 h+=9;
				 else if(j==5)
						 h-=12;
				 else if((6<=j)&&(j<=8))
					 h+=1; 
				 else if((9<=j)&&(j<=10))
					 h-=2;
				 
				 if(h<1)
					 h=1;
				 if(t<1)
					 t=1;
				 if(t>70)
					 t=70;
				 if(h>70)
					 h=70;
				 for(int a=0;a<70;a++)
				 {
					if(((h-1)==a)&&((t-1)==a))
						race[a]='O';
					else if((h-1)==a)
						race[a]='H';
					else if((t-1)==a)
						race[a]='T';
					else
					{
						race[a]=' ';
						if (a==69)
							race[a]='|';
					}							
				 }
				 System.out.println(race);
				 if((t==70)&&(h==70))
				 {
					 System.out.println("Tie");
					 break;
				 }
				 else if(t==70)
				 {
					 System.out.println("TORTOISE WINS!!!! YAY!!!");
					 break;
				 }
				 else if(h==70)
				 {
					 System.out.println("hare wins. yuch.");
					 break;
				 }
				 
			 }
	 }
}
