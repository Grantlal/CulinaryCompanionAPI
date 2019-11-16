package Classes;

import java.sql.Time;

public class RecipeTechnique {
    Time techniqueLength;
    String techniqueName;
    String techniqueLocation;

    public RecipeTechnique() {
    }

    public String returnConfirmation(){
        return "The end point works";
    }

    public Time getTechniqueLength() {
        return techniqueLength;
    }

    public void setTechniqueLength(Time techniqueLength) {
        this.techniqueLength = techniqueLength;
    }

    public String getTechniqueName() {
        return techniqueName;
    }

    public void setTechniqueName(String techniqueName) {
        this.techniqueName = techniqueName;
    }

    public String getTechniqueLocation() {
        return techniqueLocation;
    }

    public void setTechniqueLocation(String techniqueLocation) {
        this.techniqueLocation = techniqueLocation;
    }
}
