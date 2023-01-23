public class Assdub
  {
public static void main(String[]args)
    {
int f[]={4,8,9,7,5,8};
for(int i=0;i<f.length-1;i++)
{
for(int j=i+1;j<f.length-1;j++)
{
if(f[i]>f[j])
{
int temp=f[i];
f[i]=f[j];
f[j]=temp;
}
}
}
for(int k=0;k<f.length-1;k++)
{

System.out.println(f[k]);
}


}
}

