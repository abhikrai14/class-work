import java.rmi.*;

public class ProductClient {
     public static void main( String args[] ) {

        // String url =  "rmi:///";
         try {
      //String url= "rmi://193.1.24.1/";      // if object located remotely
        	 String url = "rmi://192.168.23.127/";
         Product p = ( Product ) Naming.lookup( url + "toaster" );

                     String d = p.getDescription();
                     System.out.println( "Result: " + d );
                     System.in.read();
                } catch( Exception e ) {
         System.err.println( "Error " + e );}
    }
}