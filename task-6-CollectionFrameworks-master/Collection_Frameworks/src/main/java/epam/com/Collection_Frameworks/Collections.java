package epam.com.Collection_Frameworks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Person> al=new ArrayList<Person>(10);
		while(true) {
			System.out.println("1. Fetching		2.Adding	  3.Removing	  4.Printing	5.Quit");
			int choice=Integer.parseInt(br.readLine());
			int exit=0;
			switch(choice)
			{
			case 1:{
				System.out.println("Enter the name of the person whose age has to be found");
				String name=br.readLine();
				int flag=0;
				Iterator<Person> i=al.iterator();
				while(i.hasNext()) {
					Person p=i.next();
					if(p.name.equals(name))
					{
						System.out.println("The age of "+name+" is "+p.age);
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("Person with name "+name+" not found");
				}
				break;
			}
			
			case 2:{
				System.out.println("Enter the name and age of the person to be added to the list");
				String[] inp=br.readLine().split(" ");
				String name=inp[0];
				int age=Integer.parseInt(inp[1]);
				al.add(new Person(age,name));
				break;
			}
			case 3:{
				System.out.println("Enter the name of the person to be removed from the list");
				String name=br.readLine();
				int del=-1,index=0;
				Iterator<Person> i=al.iterator();
				while(i.hasNext()) {
					Person p=i.next();
					if(p.name.equals(name))
					{
						del=index;
						break;
					}
					index++;
				}
				if(del==-1)
				{
					System.out.println("Person with name "+name+" not found");
				}
				else {
					al.remove(del);
				}
				break;
			}
			
			case 4:{		
				System.out.println(al);
				break;
			}
			case 5:{
				exit=1;
				break;
			}
			}
			if(exit==1)
			{
				break;
			}
		}
	}

}