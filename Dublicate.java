public class Dublicate
  {
public static void main(String[]args)
    {
int f[]={4,5,6,7};
for(int i=0;i<f.length;i=i+1)
{
for(int j=i+1;j<f.length;j=j+1)
{
if(f[i]==f[j])
{
f[j]=0;
}
System.out.println(f[i]+" "+f[j]);
}

}
}
}

