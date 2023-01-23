public class Mformulate
{
public static void main(String[]args)
{
char j[]={'Z','A','A','R','K','R','A','P','P','R','S','S'};
String d="";
for(int i=0;i<j.length;i=i++)
{
for(int k=0;k<j.length;k=k++)
{
if(j[i]==j[k])
{
System.out.println();
}
}
d=d+j[i];
}
System.out.println(d);



}
}
