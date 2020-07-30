package myself01;

public class day02demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*编写一个程序，求出200到300之间的数，且满足条件：它们三个数字之积为42，三个数字之和为
		12。*/
	
	for(int a=200;a<=300;a++){
		int s=a/100;
		int d=a/10%10;
		int f=a%10;
		if(s*d*f==42&&s+d+f==12){
			System.out.println(a);
		
		}
	}
	
	}

}
