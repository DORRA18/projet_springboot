package ressourceshumaines;

public class InputData {
    private int Année;
    private int NombreDeRecrutements;
    private int NombreDeDéparts;
    private int EffectifDébut;

    // Getters and setters
    public int getAnnée() {
        return Année;
    }

    public void setAnnée(int année) {
        this.Année = année;
    }

    public int getNombreDeRecrutements() {
        return NombreDeRecrutements;
    }

    public void setNombreDeRecrutements(int nombreDeRecrutements) {
        this.NombreDeRecrutements = nombreDeRecrutements;
    }

    public int getNombreDeDeparts() {
        return NombreDeDéparts;
    }

    public void setNombreDeDéparts(int numberOfDepartures) {
        this.NombreDeDéparts = numberOfDepartures;
    }

    public int getEffectifDébut() {
        return EffectifDébut;
    }

    public void setEffectifDébut(int effectifdébut) {
        this.EffectifDébut = effectifdébut;
    }
}

