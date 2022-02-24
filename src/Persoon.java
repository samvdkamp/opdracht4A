public class Persoon {
    String naam = null;
    int leeftijd;

    public Persoon(String nm, int lft) {
        naam = nm;
        leeftijd = lft;

    }

    public String toString() {
        return naam + "; leeftijd: " + leeftijd;
    }
}
