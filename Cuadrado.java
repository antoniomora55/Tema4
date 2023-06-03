package Abstractas;

public class Cuadrado extends Figura{
	private double lado;
	public Cuadrado(String nom, String col,double lado) {
		super(nom, col);
		this.lado=lado;
		// TODO Auto-generated constructor stub
	}
	
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}



	public double area() {
		return(lado*lado);
	}


	@Override
	public String toString() {
		return super.toString()+"\nlado: "+lado;
	}
	
}
