
package Herencia;

public class Fecha {
    private byte dia;
	private byte mes;
	private int año;
	
	public Fecha () {}
	
	public Fecha (byte dia,byte mes,int año) {
            this.dia=dia;
		this.mes=mes;
		this.año=año;
        }

	
	public byte getDia() {
		return dia;
	}

	public void setDia(byte dia) {
		this.dia = dia;
	}

	public byte getMes() {
		return mes;
	}

	public void setMes(byte mes) {
		this.mes = mes;
	}

	public int getAño() {
		return  año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	public String toString () {
		return + dia+" de "+mes+" del "+año;
		
		
	}
}
