public class Test8{
public static void main(String[]aaa){
String s = "JAVA 12345";
char c[] = s.toCharArray();
for(int i = 0 ; i <c.length;i++)
{
    if(c[i]>=48 && c[i]<= 57)
    {
             System.out.print(c[i]);
    }
    
    else
    {
    if(i%2==0)
    {//Upper Case
        System.out.print(c[i]);
    }else
    {//Lower Case
    if(c[i] != ' ')
                System.out.print(c[i]);
    }
}
}
}
}
