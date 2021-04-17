
public class CD implements Packable {
    private String artist;
    private String nameOfCD;
    private int publicationYear;
    private double weight;
    
    public CD(String artist, String nameOfCD, int publicationYear) {
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }
    
    public double weight() {
        return weight;
    }
    
    public String toString() {
        return artist + ": " + nameOfCD + " (" + publicationYear + ")";
    }
    
    
}
