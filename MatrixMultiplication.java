package com.master.java;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}}; 
		int sum=0;
		int c[][]= new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					sum = sum + a[i][k]*b[k][j];
				}
				c[i][j]= sum;
				sum=0;
				//System.out.print(c[i][j]+" ");
			}
			//System.out.println();
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


	}

}