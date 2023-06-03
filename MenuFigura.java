package Abstractas;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MenuFigura {
	public static void main(String args[]) {
		menu();
	}
	public static void menu() {
	int opc;
	Figura arrFig[]=new Figura[10];
	int j=0;
	do {
		opc=Integer.parseInt(JOptionPane.showInputDialog("FIGURAS REGISTRADAS: \n1. Triangulo 	\n2. Cuadrado \n3. Imprimir datos \n4. Salir"));
		switch(opc) {
		
		case 1: if(j<10) {
			Figura trian=new Triangulo("Triangulo", "Rojo", Integer.parseInt(JOptionPane.showInputDialog("ingresa la base")), Integer.parseInt(JOptionPane.showInputDialog("ingresa la altura")));
		arrFig[j]=trian;j++;
		
		
		}else {
			JOptionPane.showMessageDialog(null, "no puedes ingresar mas datos");
		} break;
		case 2: if(j<10){
			Figura cuadrado=new Cuadrado("Cuadrado", "Azul", Double.parseDouble(JOptionPane.showInputDialog("ingresa el lado")));
			arrFig[j]=cuadrado;j++;
			
			
		}else {
			JOptionPane.showMessageDialog(null, "no puedes ingresar mas datos");

		}
		break;
		case 3:
			String Acu="";
			for(int i=0;i<j;i++) {
				Acu="\n"+arrFig[i];
} JOptionPane.showMessageDialog(null, Arrays.toString(arrFig));
			break;
		case 4:break;
		}
		
			
	}while(opc!=4);
	}
	
}
