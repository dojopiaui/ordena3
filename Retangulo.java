
public class Retangulo {

    double base, altura;
    

    public Retangulo(double b, double a) {
        base = b;
        altura = a;
    }
    
    double area() {
        return base * altura;
    }
    
    double perimetro () {
        return 2*base + 2*altura;
    }  

}
