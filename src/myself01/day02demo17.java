package myself01;

public class day02demo17 {
	public static void main(String[] args) {
	int a=120;
	int b=0;
	for(int i=2;;){
		if(a%i!=0){
			i++;
		}
		else{
			b=a;
			System.out.print(i+"*");
			a/=i;
		}
		if(b/i==1){
			System.out.print(1);
			break;
		}
	}
		
	}
}
