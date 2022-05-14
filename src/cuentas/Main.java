package cuentas;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta(2,2500);
        operativa_cuenta(1,2000);
    }

    public static void operativa_cuenta (int operacion, float cantidad  ) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Juan López","1000-2365-85-1230456789", 2500, 0);
        switch ( operacion ){


            case 1:

                try {
                    System.out.println("Cargo en cuenta");
                    cuenta1.retirar(cantidad);
                    System.out.println("El nuevo saldo es: " + cuenta1.getSaldo());
                } catch (Exception e) {
                    System.out.print("Fallo al retirar");
                }
                break;

            case 2:
                try {
                    System.out.println("Abono en cuenta");
                    cuenta1.ingresar(cantidad);
                    System.out.println("El nuevo saldo es: " + cuenta1.getSaldo());
                } catch (Exception e) {
                    System.out.print("Fallo al ingresar");
                }

        }
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es " + saldoActual);
    }
}
