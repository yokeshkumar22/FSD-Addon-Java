package Session3;

public class Multidimensional {
	
	public static void main(String[] args) {
		
		int[][] a = {{2,4},{5,7},{7,3},{3,1}};
		//access all elements in the nested forloop
//		
//		for(int i = 0; i<a.length; i++) {
//			
//			for(int j = 0; j<a[i].length; j++) {
//				System.out.print(a[i][j]);
//			}
//			System.out.println();
	//	}
		
		for(int[] i : a) {
			for(int j : i) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}

}
