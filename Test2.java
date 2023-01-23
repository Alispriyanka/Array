public class Test2
 {
public static void main(String args[])
{
 long startTime=System.currentTimeMillis();
    int a[]={7,3,1,4,9};
      int b[]={2,4,6,3,10};
     
        for(int i=0;i<a.length;i++)
 {
          for(int j=0;j<a.length;j++)
 {

          if(a[i]==b[j])
    {
      
System.out.println(a[i]);
long endTime=System.currentTimeMillis();
System.out.println(endTime-startTime+"ms");
      }
}


}





}


}
