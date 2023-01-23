public class Mduplicate
{
public static void main(String[]args)
{
int j[]={1,2,3,4,1,5};

for(int i=0;i<j.length;i++)
{
for(int k=i+1;k<j.length;k++)
{

if(j[i]==j[k])
{
System.out.println("find--->"+j[k]);
}
}
}
}
}
