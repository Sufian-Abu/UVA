package acm_10815_andys_first_dictionary;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		String string1,string2;
		//string1=input.nextLine();
		HashSet<String> abu=new HashSet<String>();
		ArrayList<String>koko=new ArrayList<String>();
		int counter=0;;
		string1=input.readLine();
		while((string1=input.readLine())!=null)

		{
			//if (string1.equals("#")) {
                //break;
            //}
			string2="";
		for(counter=0;counter<string1.length();counter++)
		{
			if(Character.isLetter(string1.charAt(counter)))
			{
				string2=string2+string1.charAt(counter);
				
			}
			else
			{
				string2=string2.toLowerCase();
				if(string2.length()>0)
				{
					abu.add(string2);
				}
				string2="";
			}
		}
		if(string2.length()>0)
		{
			string2=string2.toLowerCase();
			abu.add(string2);
		}
		}
		
     //System.out.println("hefbjekjke");
	
		koko.addAll(abu);
		Collections.sort(koko);
		
		for( counter=0;counter<koko.size();counter++)
		{
			System.out.println(koko.get(counter));
		}
		}

}




