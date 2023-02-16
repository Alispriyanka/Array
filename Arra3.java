public class Arra3
{
public static void main(String[]args)
{
int a[]={9,3,1,8,3,6,3};
int count=0;
int duplicate=0;
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
duplicate=a[j];
count=count+1;
}
}

}
System.out.println(count);
System.out.println(duplicate);

}
}
