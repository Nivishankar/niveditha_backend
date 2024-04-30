package excelSoft;

public class Patterns {
	public static void main(String[] args) {
		int n=5;
		
		//1 1 1 1 1
		//2 2 2 2 2
		//3 3 3 3 3
		//4 4 4 4 4
		//5 5 5 5 5
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("***********************************");
		
//		1 2 3 4 5
//		1 2 3 4 5
//		1 2 3 4 5
//		1 2 3 4 5
//		1 2 3 4 5

		for(int i=1;i<=n;i++) {
			int j=1;
			while(j<=n) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
		}
		System.out.println("************************************");
		
//		1
//		2 3
//		3 4 5
//		4 5 6 7
//		5 6 7 8 9
		
		for(int i=1;i<=n;i++) {
			int k=i;
			for(int j=1;j<=i;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}

//		1 0 1 0 1
//		1 0 1 0 1
//		1 0 1 0 1
//		1 0 1 0 1
//		1 0 1 0 1
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j%2!=0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println("************************************");

//		1,1 2,1 3,1 4,1 5,1
//		1,2 2,2 3,2 4,2 5,2
//		1,3 2,3 3,3 4,3 5,3
//		1,4 2,4 3,4 4,4 5,5
//		1,5 2,5 3,5 4,5 5,5

		for(int j=1;j<=n;j++) {
				System.out.print("1"+","+j+" "+"2,"+j+" "+"3,"+j+" "+"4,"+j+" "+"5,"+j);
				System.out.println();

			}
	}
}
