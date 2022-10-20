import ch.aplu.turtle.*;
/**
 * Beschreiben Sie hier die Klasse PYTHAGORASBAUM.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KOCHSCHEKURVE 
{
    private TurtleFrame frame;
    private Turtle turtle;

    public KOCHSCHEKURVE() {
        frame = new TurtleFrame("Rekursion", 800, 600);
        turtle = new Turtle(frame);
        turtle.setPos(-300, 0);
        turtle.right(90);
        turtle.setColor(turtle.BLACK);
        turtle.setPenColor(turtle.BLACK);
        turtle.speed(999999999);
    }

    public void zeichneQuadrat(double länge) {
        for(int i = 0; i < 4; i++) {
            turtle.forward(länge);
            turtle.left(90);
        }
    }

    public void zeichneKochscheKurve(double länge, int n) {
        if (n < 1) {
            turtle.forward(länge);
        } else {
            zeichneKochscheKurve(länge / 3, n - 1);
            turtle.left(60);
            zeichneKochscheKurve(länge / 3, n - 1);
            turtle.right(120);
            zeichneKochscheKurve(länge / 3, n - 1);
            turtle.left(60);
            zeichneKochscheKurve(länge / 3, n - 1);
            turtle.right(60);
        }
        
    }
}
