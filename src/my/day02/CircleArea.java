package my.day02;

import java.util.Scanner;
import java.util.Random;
public class CircleArea 
{
	public static void main(String[] args)
	{
		/*while(true)
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("�������� �Է��Ͻÿ� : ");
			float length = scan.nextFloat();
			if(length <=0)
			{
				System.out.println("0������ �� �Դϴ�.");
				continue;
			}
			else
			{
				System.out.print("���� ũ��� "+(length*length*3.14)+"�Դϴ�.");
				break;
			}
		}*/
		
		/*Scanner Scan = new Scanner(System.in);
		System.out.print("���� ���� : ");
		double num_len = Scan.nextDouble();
		
		Scanner Scan1 = new Scanner(System.in);
		System.out.print("���� ���� : ");
		double num_mat = Scan.nextDouble();
		
		Scanner Scan2 = new Scanner(System.in);
		System.out.print("���� ���� : ");
		double num_en = Scan.nextDouble();
		
		double av = (num_len+num_mat+num_en)/3; 
		
		System.out.println("��� ���� : "+av);
		
		if(num_len ==av)
		{
			System.out.println("���� ������ ��հ� �����ϴ�.");
		}
		else if(num_len >av)
		{
			System.out.println("���� ������ ��պ��� Ů�ϴ�");
		}
		else if(num_len <av)
		{
			System.out.println("���� ������ ��պ��� �۽��ϴ�.");
		}
		
		if(num_mat ==av)
		{
			System.out.println("���� ������ ��հ� �����ϴ�.");
		}
		else if(num_mat >av)
		{
			System.out.println("���� ������ ��պ��� Ů�ϴ�");
		}
		else if(num_mat <av)
		{
			System.out.println("���� ������ ��պ��� �۽��ϴ�.");
		}
		
		if(num_en ==av)
		{
			System.out.println("���� ������ ��հ� �����ϴ�.");
		}
		else if(num_en >av)
		{
			System.out.println("���� ������ ��պ��� Ů�ϴ�");
		}
		else if(num_en <av)
		{
			System.out.println("���� ������ ��պ��� �۽��ϴ�.");
		}*/
	/*	int total =0;//1~10��
		int a1 = 0;//Ȧ��
		int a2 = 0;//¦��
		for(int i=0;i<=10;i++)
		{
			total = total+i;
			if((i%2)==1)
			{
				a1=a1+i;
			}
			else
			{
				a2=a2+i;
			}
		}
		System.out.println("1~10�� �� : "+total);
		System.out.println("Ȧ���� ���� : "+a1);
		System.out.println("¦���� ���� : "+a2);
		
		for(int i=2;i<10;i++)
		{
			for(int j=1;j<10;j++)
			{
				System.out.print(i+" X "+j+" = "+i*j+"\t");
			}
			System.out.println("");
		}
		
		*/
		
		Random ran=new Random();//���� �Լ� ����
		int a =ran.nextInt(10)+1;//������ int�� ���� �� a�� �ο�
		Scanner scan = new Scanner(System.in);
	
		
		while(true)
		{
			
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int user= scan.nextInt();
			if(a != user)
			{
				System.out.println("��ġ ���� �ʽ��ϴ�.");
				if(a>user)
				{
					System.out.println("���� ������ �۽��ϴ�.");
				}
				else if(a<user)
				{
					System.out.println("���� ������ Ů�ϴ�.");
				}
				
			}
			else if(a==user)
			{
				System.out.println("��ġ �մϴ�.");
				break;
			}
		}
		
	}
}
