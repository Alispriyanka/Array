public class Mergearr
{
public static void main(String[]args)
{
int x[]={7,3};
int y[]={1,4,9};
int a[]=new int [x.length+y.length];
for(int i=0;i<x.length;i++)
{
a[i]=x[i];
}
for(int i=0;i<y.length;i++)
{
a[x.length+i]=y[i];
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
} 
}

