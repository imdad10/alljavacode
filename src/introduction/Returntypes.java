package introduction;

public class Returntypes {

	public static void main(String[] args) {
		    double  e=tri();
		  System.out.println(e);
		  
		  System.out.println("-------------");
		  
		  
		  int r=rectangle.mmm();
		  System.out.println(r);
		  
		  System.out.println("-------------");
		 int t= square.demo();
		  System.out.println(t);
		  
		  System.out.println("-------------");
		  
		  int y=parallelogram.para();
		  System.out.println(y);
		  
		  System.out.println("-------------");
		  
		  double u=trapezoid.trape();
		  System.out.println(u);
		  
		  System.out.println("-------------");
		  
		 double o= eclipse.ple();
		  System.out.println(o);
		  
		  System.out.println("-------------");
		  
		  double p=sector.sec();
		  System.out.println(p);
		  
		  System.out.println("-------------");
		  
		 double w= circle.cir();
		  System.out.println(w);
		  
		}
		  static double tri()
		{
		  double a=0.12;
		  int b=9,h=15;
		  double area=a*b*h;
          return area;		  
		}
	
 public class rectangle extends triangle
 {
	   static int mmm() 
	   {
		   int w=15,h=18;
		   int angle=w*h;
           return angle;		   
	   }
 }
 public class square extends rectangle
 {
	 static int demo()
	 {
		 int a=20;
		 int area=a*a;
         return area;		 
	 }
 }
 public class parallelogram extends square
 {
	   static int para()
	   {
		   int b=9,h=12;
		   int area=b*h;
		   return area;
	   }
 }
 public class trapezoid extends parallelogram
 {
	   static double trape()
	   {
		   double q=0.15;
		   int a=8,b=14,h=10;
		   double area=q*(a+b)*h;
		   return area;
	   }
 }
 public class eclipse extends trapezoid
 {
	   static double ple()
	   {
		   int a=13,b=17;
		   double pi=3.142;
		   double area=pi*a*b;
		   return area;
     	   }
 }
 public class sector extends eclipse
 {
	   static double sec()
	   {
		   double d=0.61;
		   int r=20,t=13;
		   double area=d*r*r*t;
           return area;	   }
 }
 public class circle extends sector
 {
	   static double cir()
	   {
		   final double pi=3.142;
		   int r=10;
		   double xyz=pi*r*r;
		   return xyz;
	   }
 }
}


