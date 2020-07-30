package myself01;

public class day02demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1800;
		int b;
		lable:	for(int j=2;j<=x;j++){
				for(;;){
				int a = x%j+x/j;
				if(x%j==0){
					b=j;
					x=a;
					System.out.print(b+"*");
					
				}
				if(x%j==0&&x/j==1){
					return ;
				}
				else{
					break lable;
					}
				}
			}
			
		}
		
		
	}


