package myself01;

public class day01damo {
public static void main(String[] args){
			double a = 1000000;
		double w = a;
	    double e=0;
	    double r;
		for(int i =1;i<=3;i++){
            r=w;
			w*=1.04;
			e+=(w-r);	
		}
		double num = e/3;
		double sum =num - a*0.003;
		System.out.println(num/12);
		System.out.println("还给银行"+sum);		
		
		for (int b =0;b<3;b++){
			for(int c = 0;c< 3;c++){
				System.out.println("*");
           }
		System.out.println("\n");//打印换行
		}
	
	}


	
}
