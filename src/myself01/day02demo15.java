package myself01;

public class day02demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*��дһ���������200��300֮�������������������������������֮��Ϊ42����������֮��Ϊ
		12��*/
	
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
