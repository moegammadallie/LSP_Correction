package LSP_Correction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TransportationDevice car = new Cars();
        TransportationDevice bicycle = new Bicycle();

        ((Cars) car).startEngine();
        ((Bicycle) bicycle).startMoving();
    }
}
