package Practice;
//	1+(-2)+3+(-4)+..과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이상 되는지 구하시오.
public class Ex312 {
	public static void main(String[] args) {
//		int i;
//		int sum=0;
//		for(i=1;i<=200;i++) {
//			if(i%2==0) {
//				sum = sum - i;
//			}else {
//				sum = sum + i;
//			}
//			if(sum >=100)
//				break;
//			}
//			System.out.println(sum);
//			System.out.println(i);
//		}
//}
	     int i;
	     int sum = 0;
	        for (i = 1; sum < 100; i++) {
	            if (i % 2 == 1) {
	                sum = sum + i;
	            } else {
	                sum = sum - i;
	            }
	            System.out.println(sum);
	        }
	        System.out.println(i);
	    }
	}