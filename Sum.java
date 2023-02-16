import java.util.Scanner;
public class Sum{
public static void main(String[]aaa){
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of Amount");
int Amount=sc.nextInt();
int count_2000=0,count_500=0,count_200=0,count_100=0,count_50=0,count_20=0,count_10=0,count_5=0,count_1=0;
while(Amount>0){
switch (Amount){
case 1:
if(Amount>=2000)
{
Amount=Amount-2000;
count_2000++;
}
System.out.println(1 +"count 2000");
continue;
case 2:
if(Amount>=500)
{
Amount=Amount-500;
count_500++;
}
System.out.println(2 +"count 500");
continue;
case 3:
if(Amount>=200)
{
Amount=Amount-200;
count_200++;
}
System.out.println(3 +"count 200");
continue;
case 4:
if(Amount>=100)
{
Amount=Amount-100;
count_100++;
}
System.out.println(4 +"count 100");
continue;
case 5:
if(Amount>=50)
{
Amount=Amount-50;
count_50++;
}
System.out.println(5 +"count 50");
continue;
case 6:
if(Amount>=20)
{
Amount=Amount-20;
count_20++;
}
System.out.println(6 +"count 20");
continue;
case 7:
if(Amount>=10)
{
Amount=Amount-10;
count_10++;
}
System.out.println(7 +"count 10");
continue;
case 8:
if(Amount>=5)
{
Amount=Amount-5;
count_5++;
}
System.out.println(8+"count 5");
continue;
case 9:
 if(Amount>=1)
{
Amount=Amount-1;
count_1++;
}
continue;
}}/*
System.out.println(1 +"count 2000");
System.out.println(2 +"count 500");
System.out.println(3 +"count 200");
System.out.println(4 +"count 100");
System.out.println(5 +"count 50");
System.out.println(6 +"count 20");
System.out.println(7 +"count 10");
System.out.println(8+"count 5");*/
System.out.println( "count 1");


}
}

