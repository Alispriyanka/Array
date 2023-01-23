public class Matrix
 {
public static void main(String[]args)
  {
int q[][]={{1,2,3},{4,5,6},{7,8,9}};
int z[][]={{7,8,9},{4,5,6},{1,2,3}};
int c[][]=new int[3][3];
for(int i=0;i<q.length;i++)
{
for(int j=0;j<z.length;j++)
{
c[i][j]=q[i][j]+z[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}
