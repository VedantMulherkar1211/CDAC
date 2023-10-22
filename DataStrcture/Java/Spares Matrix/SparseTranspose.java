/*This program encompasses the implementation of a Java code 
 * that performs two main operations: first, it converts a 
 * given matrix into its corresponding sparse matrix representation,
 * and second, it finds the transpose of the generated sparse matrix.
 * The program achieves this by first transforming the non-zero elements 
 * of the matrix into a sparse matrix format, storing only the non-zero values
 * along with their respective row and column indices. Then, it proceeds to 
 * calculate the transpose of the sparse matrix, essentially swapping the rows 
 * and columns, resulting in a new matrix that represents the transposed version 
 * of the original sparse matrix. The program provides comprehensive functionalities, 
 * including display methods to showcase the matrix, sparse matrix, and the transpose 
 * of the sparse matrix, facilitating a clear understanding of the process involved in
 * these transformations.
  */
package array;

public class SparseTranspose {
	public static int NonZero(int arr[][])
	{
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]!=0)
				{
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static void display(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[][]= {{0,0,2},{0,0,0},{7,3,0},{0,0,0},{4,0,7},{0,0,0},{9,0,0}};
		System.out.println("Matrix");
		display(arr);
		System.out.println();
		int cnt=NonZero(arr);
		int sparse[][]=new int[cnt+1][3];		//cnt+1 because one row get wasted due to general information
		int newsparse[][]=new int[cnt+1][3];
		/*sparse martix*/
		sparse[0][0]=arr.length;
		sparse[0][1]=arr[0].length;
		sparse[0][2]=cnt;
		int k=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]!=0)
				{
					sparse[k][0]=i;
					sparse[k][1]=j;
					sparse[k][2]=arr[i][j];
					k++;
				}
				
			}
		}
		System.out.println("Sparse Matrix");
		display(sparse);
		
		//Transpose of sparse
		newsparse[0][0]=sparse[0][0];
		newsparse[0][1]=sparse[0][1];
		newsparse[0][2]=sparse[0][2];
		int x = 1;
        for(int i = 0; i <= cnt; i++) {
            for (int j = 1; j <= cnt; j++) {
                if (sparse[j][1] == i) {
                    newsparse[x][0] = sparse[j][1];
                    newsparse[x][1] = sparse[j][0];
                    newsparse[x][2] = sparse[j][2];
                    x++;
                }
            }
        }

		System.out.println("Transpose of Sparse");
		display(newsparse);
		
	}

}
