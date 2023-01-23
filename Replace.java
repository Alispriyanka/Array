public class Replace
 {
public static void main(String[]args)
  {
int g[]={7,5,1,4,8,9};
int o=8;
int w=16;
for(int i=0;i<g.length;i=i+1)
{
if(g[i]==o)
{
g[i]=w;
}
System.out.println(g[i]);
}
}
}
