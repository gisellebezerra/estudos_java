package oo;

public class Motor {

    boolean ligado = false;
    double fatoInjecao = 1;
    public double fatorInjecao;

    int giros(){
        if(!ligado){
            return 0;
        }else{
            return (int) Math.round(fatoInjecao * 3000);
        }
    }
}
