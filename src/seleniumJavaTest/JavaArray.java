package seleniumJavaTest;

public class JavaArray {

	public static void main(String[] args) {
		
		
		int[] arr1 = new int[5];
		arr1[0] = 2;
		arr1[1] = 4;
		arr1[2] = 4;
		arr1[3] =5;
		arr1[4] = 6;
		
		
		int [] arr2 = {1,2,3,4,5,6,7,8,9,25,50,60,99,121};
		
		String [] str1 = {"raj","kumar","agrawal"};
		
		for (int b : arr2) {
			
			if ( b % 2 == 0) {
				
				System.out.println(b);
			}
			else
			{
				System.out.println(b + " is not multiple of 2");
				System.out.println(b + "Develop brnach created");
				System.out.println(b + " Develop branch chanaged");
			}
		}

	}

}
