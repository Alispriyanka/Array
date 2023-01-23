public class Test7
 {
public static void main(String args[])
  {
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]={{1,5,9},{3,6,9},{1,4,7}};
int c[][]=new int[3][3];

for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{

c[i][j]=0;
for(int k=0;k<a[i].length;k++)
{
c[i][j]=c[i][j]+a[i][k]*b[k][j];


}
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}



 
