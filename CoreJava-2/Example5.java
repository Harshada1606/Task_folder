package Capgemini;

import java.util.Scanner;

public class Example5 {
//public static void main (String[] args){
	
//	int y1=sc.nextInt();
//	int x2=sc.nextInt();
//	int y2=sc.nextInt();
//	int R1=sc.nextInt();
//	int R2=sc.nextInt();
//	int D=((x2-x1)^2+(y2-y1)^2);
//	int k= ;
//}
	  static int circle(int x1, int y1, int x2,
              int y2, int r1, int r2)
{
int distSq = (x1 - x2) * (x1 - x2) +
             (y1 - y2) * (y1 - y2);

int radSumSq = (r1 + r2) * (r1 + r2);
double D=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)) ;
System.out.println(D);
if (distSq == radSumSq)
    return 1;
else if (distSq > radSumSq)
    return -1;
else
    return 0;
}

// Driver code
public static void main (String[] args)
{
	Scanner sc=new Scanner(System.in);
	int x1=sc.nextInt();
	int y1=sc.nextInt();
	int x2=sc.nextInt();
	int y2=sc.nextInt();
	int r1 =sc.nextInt();
	int r2=sc.nextInt();
int t = circle(x1, y1, x2,
               y2, r1, r2);
if (t == 1)
    System.out.println ( "Circle touch to" +
                         " each other.");
else if (t < 0)
    System.out.println ( "Circle not touch" +
                         " to each other.");
else
    System.out.println ( "Circle intersect" +
                         " to each other.");
     
}
}

