public class Test6
 {
public static void main(String args[])
  {
char a[]={'H','S','A','I'};
char b[]={'A','M','I','H'};
char c[]={'U','I','H','A'};
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
for(int k=0;k<a.length;k++)
{
if(a[i]==b[j])

{
if(b[j]==c[k])
{
System.out.print(a[i]);
}

}
}
  }

}

}
 }
