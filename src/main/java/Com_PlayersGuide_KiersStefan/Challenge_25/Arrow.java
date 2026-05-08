package Com_PlayersGuide_KiersStefan.Challenge_25;

/**
 * Arrow
 * Challenge: Com_PlayersGuide_KiersStefan.Challenge_25_1
 *
 * @author Stefan Kiers
 * @since 29-12-2025
 */
public final class Arrow {
    private final int arrowLength;
    private final Arrowhead selectedArrowhead;
    private final Fletching selectedFletching;

    public Arrow(int arrowLength, Arrowhead selectedArrowhead, Fletching selectedFletching) {
        this.arrowLength = arrowLength;
        this.selectedArrowhead = selectedArrowhead;
        this.selectedFletching = selectedFletching;
    }
    public int getArrowLength() {
        return arrowLength;
    }
    public Arrowhead getSelectedArrowhead() {
        return selectedArrowhead;
    }
    public Fletching getSelectedFletching() {
        return selectedFletching;
    }
    public float getCost() {
        float cost = 0.0f;

        // Arrowhead price
        switch (selectedArrowhead) {
            case STEEL:
                cost += 10;
                break;
            case WOOD:
                cost += 3;
                break;
            case OBSIDIAN:
                cost += 5;
                break;
        }

        // Fletching price
        switch (selectedFletching) {
            case PLASTIC:
                cost += 10;
                break;
            case TURKEYFEATHERS:
                cost += 5;
                break;
            case GOOSEFEATHERS:
                cost += 3;
                break;
        }
        // Length price: 0.05 gold per centimeter
        cost += arrowLength * 0.05f;
        return cost;
    }

    @Override
    public String toString(){
        return arrowLength + " cm " + selectedArrowhead + " arrow with " + selectedFletching + " fletching ";
    }
}
