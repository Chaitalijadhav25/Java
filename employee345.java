import java.util.*;
import java.io.*;
class main 
{
	int id[]=new int [100];
	float salary[]=new float[100];
	int total=0;
	int contact_no[]=new int[100];
	String name[]=new String[100];
	String address[]=new String[100];
	String username,passward,username1,passward1;
	Scanner sc=new Scanner(System.in);
	void insert_data()
	{
		int choice;
		System.out.print("\n\tHow many emplyee do you want to create:");
		choice=sc.nextInt();
		for(int i=total;i<(total+choice);i++)
		{
			id[i]=i+101;
			System.out.print("\n\tEnter emplyee "+(i+1));
			System.out.print("\n\t\t\t\t");
			System.out.print("\n\tEmplyee id: "+id[i]);
		                  System.out.print("\n\n\tEenter emplyee name:");
			name[i]=sc.next();
			System.out.print("\n\tEnter emplyee address:");
			address[i]=sc.next();
			System.out.print("\n\tEnter emplyee Contact no. :");
			contact_no[i]=sc.nextInt();
			System.out.print("\n\tEnter emplyee salary:");
			salary[i]=sc.nextFloat();	
			System.out.print("\n=============================================");
		}
		total=total+choice;
	}
	void show_data()
	{
		if(total!=0)
		{
			System.out.print("\n\n\n\t\t\t\t-----------------------------");
			System.out.print("\n\t\t\t\t|"+total+" Employee data is Stored  |");
			System.out.print("\n\t\t\t\t-----------------------------");
			for(int i=0;i<total;i++)
			{
				System.out.print("\n\n\n\t\t\t\tDATA OF EMPLYEE:"+(i+1));
				System.out.print("\n\t\t\t\t******************************");
				System.out.print("\n\t\t\t\t.....EMPLYEE INFORMATION......");
				System.out.print("\n\t\t\t\t******************************");
				System.out.print("\n\t\t\t\tEMPLYEE NAME :"+name[i]);
				System.out.print("\n\t\t\t\tEMPLYEE ADDRESS:"+address[i]);
				System.out.print("\n\t\t\t\tEMPLYEE ID :"+id[i]);
				System.out.print("\n\t\t\t\tEMPLYEE CONTACT:"+contact_no[i]);
				System.out.print("\n\t\t\t\tEMPLYEE SALARY :"+salary[i]);
				System.out.print("\n\t\t\t\t!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			}
		}
		else
		{
			System.out.print("\n\t\t\t\tno data available for showing!!!");
		}
	}
	void search_data()
	{
		if(total!=0)
		{
			int id1;
			System.out.print("\n\t\t\t\tENTER ID FOR SERCHING DATA:");
			id1=sc.nextInt();
			for(int i=0;i<total;i++)
			{
				if(id1==id[i])
				{
					System.out.print("\n\t\t\t\tDATA OF EMPLYEE:"+(i+1));
					System.out.print("\n\t\t\t\t******************************");
					System.out.print("\n\t\t\t\t.....EMPLYEE INFORMATION......");
					System.out.print("\n\t\t\t\t******************************");
					System.out.print("\n\t\t\t\tEMPLYEE NAME :"+name[i]);
					System.out.print("\n\t\t\t\tEMPLYEE ADDRESS:"+address[i]);
					System.out.print("\n\t\t\t\tEMPLYEE ID :"+id[i]);
					System.out.print("\n\t\t\t\tEMPLYEE CONTACT:"+contact_no[i]);
					System.out.print("\n\t\t\t\tEMPLYEE SALARY :"+salary[i]);
					System.out.print("\n\t\t\t\t!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					break;
				}
				if(i==total-1)
				{
					System.out.print("\n\t\t\t\tno such record is found");
				}
			}
		}
		else
		{
			System.out.print("\n\t\t\t\tNO DATA AVAILABLE FOR serching");
		}
	}
}
class Updation extends main
{
	void login() //throws IOException,//InterruptedException
	{
		System.out.print("\n\t\t\t\tEMPLOYEE MANGEMENT SYSTEM");
		System.out.print("\n\t\t\t\tlog in");
		System.out.print("\n\t\t\t\tEnter username:");
		username=sc.next();
		System.out.print("\n\t\t\t\tEnter passward:");
		passward=sc.next();
		try{
			Thread.sleep(500);
			for(int i=0;i<=3;i++)
			{
				System.out.println(".");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void menue()
	{
		int ch;
		do
		{
		System.out.print("\n\n\n\t\t\t\t***************WELOCOME TO OUR SOFTWARE*****************");
		System.out.print("\n\t\t\t\t1.insert data");
		System.out.print("\n\t\t\t\t2.show data");
		System.out.print("\n\t\t\t\t3.search data");
		System.out.print("\n\t\t\t\t4.update data");
		System.out.print("\n\t\t\t\t5.delete data");
		System.out.print("\n\t\t\t\t6.logout ");
		System.out.print("\n\t\t\t\t7.EXIT");
		System.out.print("\n\t\t\t\t***********************************************************");
		System.out.print("\nENTER YOUR CHOICE:");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: insert_data();
			break;
			case 2: show_data();
			break;
			case 3:search_data();
			break;
			case 4: update_data();
			break;
			case 5: delete_data();
			break;
			case 6: login();
			break;
			case 7:System.out.print("\n\t\t\t\tTHANKU FOR USING OUR SOFTWARE ");
			break;
			default:System.out.print("\n\t\t\t\tENTER VALID CHOICE");
		}
		}while(ch!=7);
	}
	void update_data()
	{
		if(total!=0)
		{
			int id1;
			System.out.print("\n\t\t\t\tENTER ID FOR SERCHING DATA:");
			id1=sc.nextInt();
			for(int i=0;i<total;i++)
			{
				if(id1==id[i])
				{
					System.out.print("\n\n\t\t\t\tPREVIOUS DATA:");
					System.out.print("\n\t\t\t\t******************************");
					System.out.print("\n\t\t\t\t.....EMPLYEE INFORMATION......");
					System.out.print("\n\t\t\t\t******************************");
					System.out.print("\n\t\t\t\tEMPLYEE NAME :"+name[i]);
					System.out.print("\n\t\t\t\tEMPLYEE ADDRESS:"+address[i]);
					System.out.print("\n\t\t\t\tEMPLYEE ID :"+id[i]);
					System.out.print("\n\t\t\t\tEMPLYEE CONTACT:"+contact_no[i]);
					System.out.print("\n\t\t\t\tEMPLYEE SALARY :"+salary[i]);
					System.out.print("\n\t\t\t\t!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

					System.out.print("\n\n\n\t\t\t\tEnter updating data:");
					System.out.print("\n\t\t\t\tEnter emplyee name:");
					name[i]=sc.next();
					System.out.print("\n\t\t\t\tEnter emplyee address:");
					address[i]=sc.next();
					System.out.print("\n\t\t\t\tEnter emplyee contact:");
					contact_no[i]=sc.nextInt();
					System.out.print("\n\t\t\t\tEnter emplyee salary:");
					salary[i]=sc.nextFloat();
					break;
				}
				if(i==total-1)
				{
					System.out.print("\n\t\t\t\tno such record is found");
				}
			}
		}
		else
		{
			System.out.print("\n\t\t\t\tNO DATA AVAILABLE FOR updating");
		}
	}
	void delete_data()
	{
		if(total!=0)
		{
			int ch;
			System.out.print("\n\n\t\t\t\t************DELETING MENU**********");
			System.out.print("\n\t\t\t\t1.delete all record in the emplyee");
			System.out.print("\n\t\t\t\t2.delete specific record of the emplyee");
			System.out.print("\n\t\t\t\t****************************************");
			System.out.print("\n\t\t\t\tenter your choice:");
			ch=sc.nextInt();
			if(ch==1)
			{
				total=0;
				System.out.print("\n\t\t\t\tdelete all record in the emplyee is successfulyy.....");
			}
			else if(ch==2)
			{
				int id1;
				System.out.print("\n\t\t\t\tENTER ID FOR SERCHING DATA:");
				id1=sc.nextInt();
				for(int i=0;i<total;i++)
				{
					if(id1==id[i])
					{
						for(int j=i;j<total;j++ )
						{
							id[j]= id[j+1];
							name[j]=name[j+1];
							address[j]=address[j+1];
							contact_no[j]=contact_no[j+1];
							salary[j]=salary[j+1];
							total--;
							break;
						}
						if(i==total-1)
						{
							System.out.print("\n\t\t\t\tno such record is found");
						}
					}
				}
			}
		}
		else
		{
			System.out.print("\n\t\t\t\tNO DATA AVAILABLE FOR deleted");
		}
	}
}
class employee345
{
	public static void main(String args[])throws IOException,InterruptedException
	{
		Updation M1=new Updation();
		M1.login();
		M1.menue(); 
	} 
}
