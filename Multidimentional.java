import java.util.*;
public class Multidimentional
{
public static void main(String... args)
{
//int[][] a = new int[4][4];
int[][] b = {
	{1,2,3},
	{4,5,6},
	{7,8,9}
	};
//int[][] c = new int[4][];
//System.out.println(b[1][0]);
//int[][][] d = new int[3][3][3];
//int[][][] e = new int[][][]{
//	{{1,2,3},{4,5,6},{7,8,9}},
//	{{1,2,3},{4,5,6},{7,8,9}},
//	{{1,2,3},{4,5,6},{7,8,9}}
//	};

Object[][][] cubbies = new Object[3][0][5];
int[][] java = new int[2][2];
int bla ='a';

char[] c = new char[2];
//int length = c.size();
List<String> ob1 = new ArrayList<>();
ob1.size();

//int[][] array3 = {1,2,3},{0};

	//System.out.println(b[0][0].length);
OUTER: for(int[] row: b)
{
	INNER: for(int i=0;i<row.length;i++)
	{
		if(row[i]%2==0)
		continue INNER;
		System.out.print(" "+row[i]);
	}
	System.out.println();
}
}
}