public class Count
 { 
public static void main(String[]args)
  {
int p[]={4,5,8,9,6,8};
int a=8;
int counter=0;

for(int i=0;i<p.length;i=i+1)
{
if(p[i]==a)
{
counter=counter+1;

System.out.println(a+"is present"+counter+"times");
}
}
}

}
