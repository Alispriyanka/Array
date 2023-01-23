public class Matrixdiagonal{
public static void main(String[]args){
int a[][]={{1,2,3},
          {4,5,6},
          {7,8,9}};
/*int j[][]=new int[3][3];*/
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
if(i==j)
/*c[][]=i+j;*/
System.out.print(a[i][j]);
else{
System.out.println(0);
}
}}
System.out.println();
}}
