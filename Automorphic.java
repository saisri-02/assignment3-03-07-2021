import java.util.*;
class Automorphic
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
int n,sqr,c=0,num,r;
System.out.println("Enter n value : ");
n=sc.nextInt();
sqr=n*n;
num=n;
while(n!=0)
{
    r=n%10;
    c++;
    n=n/10;
}
if(sqr % (Math.pow(10,c))==num)
System.out.println(num+" is automorphic number");
else
System.out.println(num+" is not automorphic number");
}
}