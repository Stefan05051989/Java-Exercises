package Com_PlayersGuide_KiersStefan.Challenge_24;

class Soup {
    private final SoupType soupType;
    private final MainIngredient mainIngredient;
    private final Seasoning seasoning;

    public Soup(SoupType soupType, MainIngredient mainIngredient, Seasoning seasoning){
        this.soupType = soupType;
        this.mainIngredient = mainIngredient;
        this.seasoning = seasoning;
    }
    @Override
    public String toString(){
        return seasoning + " " + mainIngredient + " " + soupType;
    }
}
