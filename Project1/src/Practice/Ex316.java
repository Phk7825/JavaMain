package Practice;

public class Ex316 {
	public static void main(String[] args) {
		int i =2;	// 구구단 앞자리
		int j ; // 구구단 뒷자리 
			for(j=1;j<=3;j++){	
//				for(i = 2 ; i <=4 ; i++) {
				System.out.println(i+"*"+j+"="+2*j+"     "+(i+1)+"*"+j+"="+3*j+ "     " +(i+2)+ "*" +j+"="+4*j);
			}				
//		}
		System.out.println("\n");
			for(j=1;j<=3;j++){	
				System.out.println((3*i-1)+"*"+j+"="+5*j+"     "+(3*i)+"*"+j+"="+6*j+ "     " +(3*i+1)+ "*" +j+"="+7*j);
			}
			System.out.println("\n");
			for(j=1;j<=3;j++){	
				System.out.println((4*i)+"*"+j+"="+8*j+"     "+(4*i+1)+"*"+j+"="+9*j);
			}
	}
}