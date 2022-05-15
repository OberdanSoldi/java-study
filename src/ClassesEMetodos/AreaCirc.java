package ClassesEMetodos;

public class AreaCirc {
    double raio;
    double pi;

    final static double PI = 3.14;
    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    double area(){
        return raio * raio * pi;
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
