public class Test {
    public static void main(String[] args){

    }
    public String usaVeicoli(Veicoli[] v){
        Random ran = new Random();
        for(int i=0;i<v.length;i++){
            if(ran.nextInt(0, 100)>75) v[i].setGuasto(true);
        }
    }
}
