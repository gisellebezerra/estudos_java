package oo;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());
        
        c1.ligar();
        System.out.println(c1.estaLigado()); 
        
        System.out.println(c1.motor.giros());    //3000 giros

        
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros()); //7800 giros
        
        //A cada método frear passado o giro irá diminuir
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        
        System.out.println(c1.motor.giros()); //3000 giros

        
        


        
    }
}
