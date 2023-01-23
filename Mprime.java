public class Mprime
  {
public static void main(String args[])
   {
int number=100;
boolean flag=false;
for(int i=2;i<=number/2;i=i+1)
{
if(number%i==0)
{
flag=true;
break;
}

}
if(flag)
{
System.out.println("Non Prime number"+number);

}
else
{
System.out.println("Prime number"+number);
}

}

}
