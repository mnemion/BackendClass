package javatest;
// double loop
public class java7 {

	public static void main(String[] args) {
		new data4().abc();
	}
}

class data4{
	public void abc() {
		//for + for
		/*
		int f, ff;
		int total;
		for(f = 1; f <= 5; f++) {
			for(ff = 1; ff <= 5; ff++) {
				total = f + ff;
				System.out.println(total);
			}
		}
		*/
		/*
		int w = 1;	//초기화 실행 필요 (while, do~while)
		int ww= 1;
		int total = 0;
		while(w <= 5) {
			while(ww <= 5) {
				total = w + ww;
				System.out.println(total);
				ww++;
			}
			w++;
		}
		*/
		
		/*
		int z = 1;
		int total;
		do{
			int zz = 1;
			do {
				total = z + zz;
				System.out.println(total);
				zz++;
			}while(zz <=5);
			z++;
		}while(z <= 5);
		*/
		
		/* 
		 for + while
		 	 1+1 =2
		 	 1+2 =3
		 	 1+3 =4
		 	 2+1 =3
		 	 2+2 =4
		 	 2+3 =4
		 	 3+1 =4
		 	 3+2 =5
		 	 3+3 =6
		 */
		for (int i = 1; i < 4; i++) {
		    int j = 1;
		    while (j < 4) {
		        System.out.println(i + " + " + j + " = " + (i+j));
		        j++;
		    }
		}
		
		int w = 1;
		int f;
		while(w <=3) {
			for(f=1; f<=3; f++) {
				System.out.println(w + "+" + f + "=" + (w+f));
			}
			w++;
		}
	}
}