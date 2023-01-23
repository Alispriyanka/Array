public class Diagonol
 {
public static void main(String[]args)
  {
int o[][]={{4,5,6},{1,2,3},{7,8,9}};
for(int i=0;i<o.length;i++)
{
for(int j=0;j<o[i].length;j++)
{
if(o[i]==o[j])
{
System.out.println          (o[i][j]);

}
else
{
System.out.print(0);
}
System.out.println();
}
}
}
}
