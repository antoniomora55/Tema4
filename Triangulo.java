package Abstractas;

public class Triangulo extends Figura{
	private int base,altura;

	public Triangulo(String nom, String col, int base, int altura) {
		super(nom, col);
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double area() {
		return(this.base*this.altura)/2;
	}

	@Override
	public String toString() {
		return super.toString()+"\nbase: "+base + "\naltura: "+altura + "\nArea: "+area();
	}
}
