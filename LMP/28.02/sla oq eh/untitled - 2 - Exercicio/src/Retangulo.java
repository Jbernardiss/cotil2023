public class Retangulo {

//Atributos

private int base;
private int altura;
private int perimetro;
private int area;

  public int getbase()
  {
      return base;
  }

  public void setbase(int base){
      if(0>altura<21) {
          this.base = base;
      }
      else
          this.base = 0;
  }
    public int getaltura()
    {
        return altura;
    }

    public void setaltura(int altura){
        this.altura = altura;
    }
    public int getperimetro()
    {
        return perimetro;
    }

    public void setperimetro(int perimetro) {
        this.perimetro = perimetro;
    }
    public int getarea()
    {
        return area;
    }

    public void setarea(int area){
        this.area = area;
    }
    //Construtor

    public void perimetro(int base, int altura){
          (base * 2 + altura * 2) = perimetro;
          this.perimetro = perimetro;
      }

      public void area(int base, int altura) {
          (base * altura) = area;
          this.area = area;
      }



    }














































}
