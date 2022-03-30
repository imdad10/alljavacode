package introduction;

public class triangle {

	public static void main(String[] args)  
		{
		  tri();
		  System.out.println(" triangle program executed");
		  
		  System.out.println("-------------");
		  
		  
		  rectangle.mmm();
		  System.out.println(" rectangle program executed");
		  
		  System.out.println("-------------");
		  square.demo();
		  System.out.println("square program excuted");
		  
		  System.out.println("-------------");
		  
		  parallelogram.para();
		  System.out.println("parallelogram program excecuted");
		  
		  System.out.println("-------------");
		  
		  trapezoid.trape();
		  System.out.println("trapezoid program excecuted");
		  
		  System.out.println("-------------");
		  
		  eclipse.ple();
		  System.out.println("eclipse program excecuted");
		  
		  System.out.println("-------------");
		  
		  sector.sec();
		  System.out.println("sector program excecuted");
		  
		  System.out.println("-------------");
		  
		  circle.cir();
		  System.out.println("circle program excecuted");
		  
		}
		  static void tri()
		{
		  double a=0.5;
		  int b=5,h=10;
		  double area=a*b*h;
		   System.out.println(area);
		  
		}
	
   public class rectangle extends triangle
   {
	   static void mmm() 
	   {
		   int w=10,h=12;
		   int angle=w*h;
		   System.out.println(angle);
		   
	   }
   }
   public class square extends rectangle
   {
	 static void demo()
	 {
		 int a=10;
		 int area=a*a;
		 System.out.println(area);
		 
	 }
   }
   public class parallelogram extends square
   {
	   static void para()
	   {
		   int b=7,h=9;
		   int area=b*h;
		   System.out.println(area);
	   }
   }
   public class trapezoid extends parallelogram
   {
	   static void trape()
	   {
		   double q=0.5;
		   int a=7,b=11,h=15;
		   double area=q*(a+b)*h;
		   System.out.println(area);
	   }
   }
   public class eclipse extends trapezoid
   {
	   static void ple()
	   {
		   int a=10,b=12;
		   double pi=3.142;
		   double area=pi*a*b;
		   System.out.println(area);
	   }
   }
   public class sector extends eclipse
   {
	   static void sec()
	   {
		   double d=0.5;
		   int r=15,t=10;
		   double area=d*r*r*t;
		   System.out.println(area);
	   }
   }
   public class circle extends sector
   {
	   static void cir()
	   {
		   final double pi=3.142;
		   int r=5;
		   double xyz=pi*r*r;
		   System.out.println(xyz);
	   }
   }
}


