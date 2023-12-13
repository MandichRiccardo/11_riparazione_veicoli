public class Motociclo {
    protected int cilindrata;

    public Vettura(String targa, String marca, String modello, int cilindrata) {
        super(targa, marca, modello);
        this.cilindrata = cilindrata;
    }
    public vettura(){
        super();
        this.cilindrata = Interazione.input("di che tipo è questo veicolo?");
    }

    public int getCilindrata() {
        return cilindrata;
    }
    public String toString() {
        return super.toString() + "cilindrata:\t" + cilindrata + "\t";
    }
}