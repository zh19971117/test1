package myself01;

public class day02demo11 {
	public static void main(String[] args) {
		int a=12345;
		for(int i=1;;i++)
		{
			
			a=a/10;
			if(a==0)
			{
				System.out.println(i);
				break;
			}
		}
		
	}
}
