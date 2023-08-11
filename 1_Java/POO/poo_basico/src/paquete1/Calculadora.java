package paquete1;

public class Calculadora {
    
    static public float PI = 3.14f;
    static public float e;

    static { //este bloque solo se ejecuta "UNA sola vez"
        System.out.println("Hola desde static");
        e = PI+3;
    }

    public Calculadora(){
        System.out.println("Hola desde el constructor");
    }

    int suma(int num1, int num2){
        int resultado =num1 + num2;
        return resultado;
    }

    int suma(int num1, int num2, int num3){
        int resultado = num1 + num2 + num3;
        return resultado;
    }
    // sobre carga de metodos: con el mismo nombre (suma) puedo tener diferente tipo de implementación
}
