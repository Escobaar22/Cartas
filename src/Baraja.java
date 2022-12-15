public class Baraja {
    Carta c=new Carta();
    Carta [] numero = new Carta[12];
    String [] coll={"oros", "copes", "espases", "bastos"};

    public Baraja(){

    }

    public void crearCarta(){
        for(int i = 0; i <coll.length; i++){
            for(int j = 0; j < numero.length;j++){
                System.out.println(j+1+" "+coll[i]);
            }
            System.out.println();
        }
    }
}
