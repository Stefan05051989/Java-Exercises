package Com_PlayersGuide_KiersStefan.Challenge_28;
/**
 * ConstructorExplained
 * Challenge: Com_PlayersGuide_KiersStefan.Challenge_28
 *
 * @author Stefan Kiers
 * @since 26-8-2026
 */
/*
The first pedestal asks you to create a Point class to store a point in two dimensions. Each point is
represented by an x-coordinate (x), a side-to-side distance from a special central point called the origin,
and a y-coordinate (y), an up-and-down distance away from the origin.

Objectives:

    Define a new Point class with fields and getter methods for x and y.
    Add a constructor to create a point from a specific x- and y-coordinate.
    Add a parameterless constructor to create a point at the origin (0, 0).
    In your main method, create a point at (2, 3) and another at (-4, 0). Display these points on the
    console window in the format (x, y) to illustrate that the class works.
    Answer this question: Are your x and y immutable? Why did you choose what you did?

 */
class Point {
    //declare variables, base for immutability.
   private final int x;
   private final int y;
   // generate getters, geen setters! Dit is de bedoeling voor onveranderlijke objecten!
    // getX / getY ipv direct field access, precies wat encapsulatie inhoud.
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    //Parameter-less constructor, needs to be same name as class!!!!
    public Point() {
        //Initialize the variables
        this(0,0);
    }
    // constructor with parameters!
    public Point(int x, int y) {
        System.out.println("Constructor is called");
        this.x = x;
        this.y = y;
    }
    //main() method
    public static void main(String[] args) {
        Point origin = new Point();
        Point pointA = new Point(2, 3);
        Point pointB = new Point(-4, 0);

        System.out.println("(" +  origin.getX() + ", " + origin.getY() + ")");
        System.out.println("(" +  pointA.getX() + ", " + pointA.getY() + ")");
        System.out.println("(" +  pointB.getX() + ", " + pointB.getY() + ")");
    }
}
/*
Zijn mijn X en Y immutable? Waarom deze keuze?
Mijn X en Y zijn immutable omdat de primitieven zowel private als final zijn, EN er zijn geen setters toegevoegd,
kunnen ze niet meer veranderen nadat het object is aangemaakt.
bij een primitief int-field is "final" op zichzelf al voldoende om full immutability te garanderen, omdat een int geen
interne "state" heeft die apart gewijzigd zou kunnen worden.
(dit zou anders kunnen zijn bij een veranderlijk object-field, zoals een List, waarbij final alléén voorkomt dat de referentie opnieuw
wordt toegewezen, maar NIET de inhoud ervan verandert!)
ik heb hiervoor gekozen omdat een Point een vaste coördinaatwaarde representeert en niet iets met een veranderende life-cycle (van een object)
Een ander soort object (zoals een User in een CRUD systeem) zou wel setters nodig hebben omdat het wel eens zijn
e-mailadres oid zou kunnen veranderen. Dat representeert een veranderende "state" in plaats van een vaste waarde, zoals hier met de int.
 */