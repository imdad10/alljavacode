package introduction;

public class functions {

	public static void main(String[] args) {
      functions.tri(0.5, 5, 10);
      System.out.println("triangle program executed");
      
      System.out.println("--------");
      
      rectangle.mmm(10, 12);
      System.out.println("recangle program executed");
      
      System.out.println("--------");
      
      square.demo(10);
      System.out.println("sqaure program executed");
      
      System.out.println("--------");
      
      parallelogram.para(10, 15);
      System.out.println("paralellogram program executed");
      
      System.out.println("--------");
      
      trapezoid.trape(0.7, 5, 11, 8); 
      System.out.println("trapezoid program executed");
     
      System.out.println("--------");
      
      eclipse.ple(0.5, 14, 6);
      System.out.println("eclipse program executed");
      
      System.out.println("--------");
      
      sector.sec(0.12, 15, 10);
      System.out.println("sector program executed");
      
      System.out.println("--------");
      
      circle.cir(0.20, 10);
      System.out.println("circle program executed");
	}
	
	static void tri(double a,int b,int h)
	{
	
	  double area=a*b*h;
	   System.out.println(area);
	  
	}

public class rectangle extends functions
{
   static void mmm(int w,int h) 
   {
	   int angle=w*h;
	   System.out.println(angle);
	   
   }
}
public class square extends rectangle
{
 static void demo(int a)
 {
	 int area=a*a;
	 System.out.println(area);
	 
 }
}
public class parallelogram extends square
{
   static void para(int b,int h)
   {
	   int area=b*h;
	   System.out.println(area);
   }
}
public class trapezoid extends parallelogram
{
   static void trape(double q,int a,int b,int h)
   {
	   double area=q*(a+b)*h;
	   System.out.println(area);
   }
}
public class eclipse extends trapezoid
{
   static void ple(double pi,int a,int b)
   {
	   double area=pi*a*b;
	   System.out.println(area);
   }
}
public class sector extends eclipse
{
   static void sec(double d,int r,int t)
   {
	   double area=d*r*r*t;
	   System.out.println(area);
   }
}
public class circle extends sector
{
   static void cir(double pi,int r)
   {
	   double xyz=pi*r*r;
	   System.out.println(xyz);
   }
}

}
