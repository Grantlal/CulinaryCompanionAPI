package Classes;
import java.util.*;

public class Technique {
    // Type is if it's a full recipe or just a single technique
    String techniqueType;
    // Name is self explanatory
    String techniqueName;
    // Url is the associated url for the video
    String techniqueUrl;
    // Tags are associated keywords with the technique
    List<String> techniqueTags;

    public Technique() {
    }

    public String returnConfirmation() {
        return "The end point works";
    }

    public String getTechniqueType() {
        return techniqueType;
    }

    public void setTechniqueType(String techniqueType) {
        this.techniqueType = techniqueType;
    }

    public String getTechniqueName() {
        return techniqueName;
    }

    public void setTechniqueName(String techniqueName) {
        this.techniqueName = techniqueName;
    }

    public String techniqueUrl() {
        return techniqueUrl;
    }

    public void setTechniqueUrl(String techniqueUrl) {
        this.techniqueUrl = techniqueUrl;
    }

    public List<String> getTechniqueTags() {
        return techniqueTags;
    }

    public void setTechniqueTags(List<String> techniqueTags) {
        this.techniqueTags = techniqueTags;

    }
}
