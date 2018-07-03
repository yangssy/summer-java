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
			System.out.print("반지름을 입력하시오 : ");
			float length = scan.nextFloat();
			if(length <=0)
			{
				System.out.println("0이하의 값 입니다.");
				continue;
			}
			else
			{
				System.out.print("원의 크기는 "+(length*length*3.14)+"입니다.");
				break;
			}
		}*/
		
		/*Scanner Scan = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		double num_len = Scan.nextDouble();
		
		Scanner Scan1 = new Scanner(System.in);
		System.out.print("수학 점수 : ");
		double num_mat = Scan.nextDouble();
		
		Scanner Scan2 = new Scanner(System.in);
		System.out.print("영어 점수 : ");
		double num_en = Scan.nextDouble();
		
		double av = (num_len+num_mat+num_en)/3; 
		
		System.out.println("평균 점수 : "+av);
		
		if(num_len ==av)
		{
			System.out.println("국어 점수는 평균과 같습니다.");
		}
		else if(num_len >av)
		{
			System.out.println("국어 점수는 평균보다 큽니다");
		}
		else if(num_len <av)
		{
			System.out.println("국어 점수는 평균보다 작습니다.");
		}
		
		if(num_mat ==av)
		{
			System.out.println("수학 점수는 평균과 같습니다.");
		}
		else if(num_mat >av)
		{
			System.out.println("수학 점수는 평균보다 큽니다");
		}
		else if(num_mat <av)
		{
			System.out.println("수학 점수는 평균보다 작습니다.");
		}
		
		if(num_en ==av)
		{
			System.out.println("영어 점수는 평균과 같습니다.");
		}
		else if(num_en >av)
		{
			System.out.println("영어 점수는 평균보다 큽니다");
		}
		else if(num_en <av)
		{
			System.out.println("영어 점수는 평균보다 작습니다.");
		}*/
	/*	int total =0;//1~10합
		int a1 = 0;//홀수
		int a2 = 0;//짝수
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
		System.out.println("1~10의 합 : "+total);
		System.out.println("홀수의 합은 : "+a1);
		System.out.println("짝수의 합은 : "+a2);
		
		for(int i=2;i<10;i++)
		{
			for(int j=1;j<10;j++)
			{
				System.out.print(i+" X "+j+" = "+i*j+"\t");
			}
			System.out.println("");
		}
		
		*/
		
		Random ran=new Random();//랜덤 함수 생성
		int a =ran.nextInt(10)+1;//랜덤값 int형 랜덤 값 a에 부여
		Scanner scan = new Scanner(System.in);
	
		
		while(true)
		{
			
			System.out.print("숫자를 입력하세요 : ");
			int user= scan.nextInt();
			if(a != user)
			{
				System.out.println("일치 하지 않습니다.");
				if(a>user)
				{
					System.out.println("랜덤 값보다 작습니다.");
				}
				else if(a<user)
				{
					System.out.println("랜덤 값보다 큽니다.");
				}
				
			}
			else if(a==user)
			{
				System.out.println("일치 합니다.");
				break;
			}
		}
		
	}
}
