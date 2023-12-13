public class Vettura extends Veicolo{
    protected String tipologia;

    public Vettura(String targa, String marca, String modello, String tipologia) {
        super(targa, marca, modello);
        this.tipologia = tipologia;
    }
    public vettura(){
        super();
        this.tipologia = Interazione.strput("di che tipo è questo veicolo?")
    }

    public String getTipologia() {
        return tipologia;
    }

    public String toString() {
        return super.toString() + "tipologia:\t" + tipologia + "\t";
    }
}