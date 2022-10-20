public class Ejercicostema3 {
    public static void main(String[] args){

        // Primera parte
        int resultado = suma(8,2,1);
        System.out.println(resultado);

        // Segunda parte
        var miCoche = new coche();
        miCoche.AgregarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}

class coche {
    public int puertas =4;

    public void AgregarPuertas() {
        this.puertas++;
    }

}
