package myself01;

public class day1 {
 
public static void main (String[] args){

/*	输出0-9之间的数，但是不包括5*/
	for(int a = 1;a<=9; a++){
		if(a != 5){
			System.out.println(a);
		}
	}
	System.out.println("=============");
/*	给定一个成绩a，使用switch结构求出a的等级。A：90-100，B：80-89，C：70-79，D：60-69，E：0~59。*/
/*假设某员工今年的年薪是30000元，年薪的年增长率6%。编写一个Java应用程序计算该员工10年后的年薪，并统计未来10年（从今年算起）总收入。*/
	int a1 = 30000;
	int sum1 = a1;
	for(int i1 = 1; i1<=9;i1++){
		a1*=1.06;
		sum1 +=a1; 
	}
	System.out.println("十年后工资"+a1);
	System.out.println("十年来的总工资"+sum1);
	
/*	猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个，第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
	以后每天早上都吃了前一天剩下的一半零一个。
	到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。*/
	int a2 = 1;
	for(int i2=1;i2<=9;i2++){
		a2 = (a2+1)*2;	
	}
	System.out.println("这十天一共摘了"+a2+"个桃子");
	
	/*一个数字，判断是一个奇数还是偶数。*/
	int a3 = 4;
	if(a3%2==0){
		System.out.println("这是一个偶数");
	}
	else{
		System.out.println("这是一个奇数");
	}
	/*编写程序， 判断一个变量x的值，如果是1，输出x=1，如果是5，输出x=5，如果是 10，输出x=10，除了以上几个值，都输出x=none*/
	
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
/*	输入三个整数x,y,z，请把这三个数由小到大输出。*/
	
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
	   System.out.println(q1+"+"+q2+"+"+q3);
   }
	
   
/*   有一个不多于5位的正整数，求它是几位数，分别打印出每一位数字。*/
   int z1=12345;//99999
   int z2=z1/10000%10;
   int z3=z1/1000%10;
   int z4=z1/100%10;
   int z5=z1/10%10;
   int z6=z1%10;
   System.out.println("万位"+z2+"千位"+z3+"百位"+z4+"十位"+z5+"个位"+z6);
   
/*   编写一个程序，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。*/
   
   
   /*由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321。*/
   int c = 1234;
   int c1=c/1000%10;
   int c2=c/100%10;
   int c3=c/10%10;
   int c4=c/1%10;
   int c5=c4*1000+c3*100+c2*10+c1*1;
   System.out.println(c5);
   
   
   
   
	/*编写一个程序，找出大于200的最小的质数。*/
	//判断一个数是不是质数，质数是除了一和本身之外不能被其他数整除
	int num = 197;
	for (int i =2;i<num;i++){
		if(i%num==0){
			System.out.println("不是素数");
			return;	
		}
	}
	System.out.println("是素数");
	
	
}

}
