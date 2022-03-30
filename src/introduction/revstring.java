package introduction;

public class revstring {

	public static void main(String[] args) {
     String str="reverse";
    int rev=str.length();
    System.out.println(rev);
     for(int i=6;i>=0;i--) {
    	
    	char hh=str.charAt(i);
    	//rev=rev+hh;
    	System.out.print(hh);
     }
    	 //System.out.println(hh);
    /* while(rev>0) {
    	System.out.print(str.charAt(rev-1));
    	rev--;
     
    	 //System.out.println(has);
     }*/
     
	}
}
