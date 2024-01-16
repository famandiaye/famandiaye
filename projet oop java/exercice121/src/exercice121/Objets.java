package exercice121;

public class Dalton {
    private double[] position;
    private double[] direction;
    private double vitesse;
    private Cheval cheval;

    public Dalton(double[] position, double[] direction, double vitesse) {
        this.position = position;
        this.direction = direction;
        this.vitesse = vitesse;
        this.cheval = null;
    }

    public void setCheval(Cheval cheval) {
        this.cheval = cheval;
    }

    public void unsetCheval() {
        this.cheval = null;
    }
    public void deplacer(double temps) {
        double distance = this.vitesse * temps;
        double[] deplacement = new double[2];
        dthis.direction[0];
         this.direction[1];
        if (this.cheval != null) {
            this.cheval.deplacer(deplacement);
        } else {
            this.position[0] += deplacement[0];
            this.position[1] += deplacement[1];
        }
    }
}

