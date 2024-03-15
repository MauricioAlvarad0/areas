
package mx.edu.cesba;

public class Area 
{
    private float base;
    private float altura;
    private float area;
    
    
    public Area()
    {
    }
     
    public void imprimir()
    {
        System.out.println("La base del triangulo es : " + base);
        System.out.println("La altura de la altura es : " + altura);
                area = (base * altura)/2;
        System.out.println("El area del triangulo es : " + area); 
        System.out.println("------------------------------------------------------------------------------------------------------");
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
