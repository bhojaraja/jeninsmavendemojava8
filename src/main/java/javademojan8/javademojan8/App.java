package javademojan8.javademojan8;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Calculator calc=new Calculator();
    	int result=calc.add(200, 200);
    	
        System.out.println( "Addition of 200 + 200 is"+result );
    }
}
