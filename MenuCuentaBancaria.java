package Herencia;

import javax.swing.JOptionPane;

public class MenuCuentaBancaria {

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        CuentaBancaria cuenta = new CuentaBancaria();
        CuentaAhorros cuenta1 = new CuentaAhorros();
        CuentaCorriente cuenta2 = new CuentaCorriente();
        byte opcion = 0;
        byte eleccion = 0;
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog("Que operacion deseas hacer\n"
                    + "1. Crear cuenta bancaria\n"
                    + "2. Crear cuenta de ahorros\n"
                    + "3. Crear cuenta corriente\n"
                    + "4. Salir\n"));
        
        switch (opcion) {
            case 1:
                do {
                  eleccion=Byte.parseByte(JOptionPane.showInputDialog(null, "ingresa una opcion\n"
                            + "1. Agregar saldo\n"
                            + "2. retirar saldo\n"
                            + "3. agregar tasa anual\n"
                            + "4. calcular interes mensual\n"
                            + "5. calcular extracto mensual\n"
                            + "6. imprimir datos\n"
                  +"7. Salir"))  ;
               
                switch (eleccion) {
                    case 1:
                        cuenta.consignar(Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese la cantidad a agregar")));
                        break;
                    case 2:
                        cuenta.retirar(Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese la cantidad a retirar")));
                        break;
                    case 3:
                        cuenta.setTasaAnual(Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese su tasa anual")));
                        break;
                    case 4:
                        cuenta.calcularInteresMensual();
                        break;
                    case 5:
                        cuenta.extractoMensual();
                        break;
                    case 6:
                        cuenta.imprimir();
                        break;
                    case 7:
                        eleccion=7;
                        break;
                } } while (eleccion<7);

                break;
            case 2:
                 do {
                  eleccion=Byte.parseByte(JOptionPane.showInputDialog(null, "ingresa una opcion\n"
                          +"1. activar cuenta\n"
                            + "2. Agregar saldo\n"
                            + "3. retirar saldo\n"
                            + "4. agregar tasa anual\n"
                            + "5. calcular interes mensual\n"
                            + "6. calcular extracto mensual\n"
                            + "7. imprimir datos\n"
                   +"8. Salir"))  ;
               
                switch (eleccion) {
                    case 1:
                        cuenta1.setSaldo(Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese mas de $10000 para activar la cuenta")));
                        break;
                    case 2:
cuenta1.consignar(Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese la cantidad a agregar")));                       
break;
                    case 3:
cuenta1.retirar(Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese la cantidad a retirar")));                      
break;
                    case 4:
                        cuenta1.setTasaAnual(Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese su tasa anual")));
                        break;
                    case 5:
                        cuenta1.calcularInteresMensual();
                        break;
                    case 6:
                        cuenta1.extractoMensual();
                        break;
                    case 7:
                        cuenta1.imprimir();
                        break;
                    case 8:
                        eleccion=8;
                        break;
                } } while (eleccion<8);
                break;
            case 3:
                 do {
                  eleccion=Byte.parseByte(JOptionPane.showInputDialog(null, "ingresa una opcion\n"
                            + "1. Agregar saldo\n"
                            + "2. retirar saldo\n"
       
                          + "3. agregar tasa anual\n"
                            + "4. calcular interes mensual\n"
                            + "5. calcular extracto mensual\n"
                            + "6. imprimir datos\n"
                  +"7. Salir"))  ;
               
                switch (eleccion) {
                    case 1:
                cuenta2.consignar(Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese la cantidad a agregar")));
                        break;
                    case 2:
                cuenta2.retirar(Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese la cantidad a retirar")));
                        break;
                    case 3:
                cuenta2.setTasaAnual(Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese su tasa anual")));
                        break;
                    case 4:
                        cuenta2.calcularInteresMensual();
                        break;
                    case 5:
                cuenta2.extractoMensual();
                        break;
                    case 6:
                cuenta2.imprimir();
                        break;
                    case 7:
                        eleccion=7;
                        break;
                } } while (eleccion<7);

                break;
            case 4:
                System.exit(0);
                break;
        }} while (opcion < 4);

    }

}
