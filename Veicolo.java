public class Veicolo {
    protected String targa;
    protected String marca;
    protected String modello;
    protected boolean guasto;

    public Veicolo(String targa, String marca, String modello) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        guasto = false;
    }
    public Veicolo(String targa, String marca, String modello) {
        this.targa = Interazione.strput("quel'è la targa di questo veicolo?");
        this.marca = Interazione.strput("qual'è la marca di questo veicolo?");
        this.modello = Interazione.strput("qual'è il modello di questo veicolo?");
        guasto = false;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public boolean getGuasto() {
        return guasto;
    }

    public void setGuasto(boolean guasto) {
        this.guasto = guasto;
    }
    public String toString(){
        String info = "";
        info += "targa:\t" + targa + "\n";
        info += "marca:\t" + marca + "\n";
        info += "modello:\t" + modello + "\n";
        return info;
    }
}