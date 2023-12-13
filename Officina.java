public class Officina {
    public double ripara(Vettura v){
        int prezzo = 10;
        if(v.guasto){
            if(v instanceof Veicolo){
                switch(v.tipologia){
                    case "diesel" -> prezzo += 40;
                    case "benzina" -> prezzo += 50;
                    default -> prezzo += 30;
                }
            }else prezzo += 30;
        }
        return prezzo;
    }
}