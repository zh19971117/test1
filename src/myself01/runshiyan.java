package myself01;

public class runshiyan {
public static void main (String[] arge){
	 int c = 1234;
	   int c1=c/1000%10;
	   int c2=c/100%10;
	   int c3=c/10%10;
	   int c4=c/1%10;
	   int c5=c4*1000+c3*100+c2*10+c1*1;
	   System.out.println(c5);
	   
	   
	   int z1=12345;//99999
	   int z2=z1/10000%10;
	   int z3=z1/1000%10;
	   int z4=z1/100%10;
	   int z5=z1/10%10;
	   int z6=z1%10;
	   System.out.println("��λ"+z2+"ǧλ"+z3+"��λ"+z4+"ʮλ"+z5+"��λ"+z6);
	   
	   
	   int q1=1, q2 =2, q3=3,q;
	   
	   if(q1>q2){
		   q=q1;
		   q1=q2;
		   q2=q;
	   }
	   else if(q2>q3){
		   q=q2;
		   q2=q3;
		   q3=q;
	   }
	   else{
		   System.out.println(q1+"\t"+q2+"\t"+q3);
}
	   int a4 = 7;
		if(a4==1){
			System.out.println("1");
		}
		else if(a4==5){
			System.out.println("5");
		}
		else if(a4==10){
			System.out.println("10");
		}
		else{
			System.out.println("none");
}
		
		int a3 = 4;
		if(a3%2==0){
			System.out.println("����һ��ż��");
		}
		else{
			System.out.println("����һ������");
		}
		
		int a2 = 1;
		
		
		for(int i2=1;i2<=9;i2++){
			
			a2 = (a2+1)*2;
			
		}
		System.out.println("��ʮ��һ��ժ��"+a2+"������");
		
		
		double a1 = 30000;
		double sum1 = a1;
		for(int i1 = 1; i1<=9;i1++){
			a1*=1.06;
			sum1 +=a1; 
		}
		System.out.println("ʮ�����"+a1);
		System.out.println("ʮ�������ܹ���"+sum1);
		
		
}
}