package com.test.question.q07;

public class Q09 {
	
	public static void main(String[] args) {
        
        int sum=0;
        String str = "";
        
        for(int i=1; i<=100; i++) {
             str = "";
            for(int j=1; j<=i; j++) {
                
				if (i % j == 0) {

					sum = sum + j;

				}

			}//for(j)

			if ((sum - i) == i) {
				for(int j=1; j<=i; j++) {
					if (i % j == 0) {
						if(i==j)break;
						str+=j;
						
						str+=", ";
					}
				}

				System.out.printf("%d = [%s]\n", i, str);
			}
            sum=0;
        }//for(i)
    }
}
