
public class Pagina {

    public static void main (String[] args) {
     suma( 2, 5, 7 );
     Auto miAuto = new Auto();
     miAuto.AbrirPuertas();
     
     System.out.println(miAuto.puertas);
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
    
}

class Auto {
    public int puertas = 4;
    public void AbrirPuertas(){
        this.puertas++;
    }
}