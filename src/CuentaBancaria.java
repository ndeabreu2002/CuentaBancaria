//Nelson De Abreu
//Escribir un programa en Java que represente la clase cuenta bancaria, la cuenta puede mostrar por pantalla los atributos de la cuenta, 
//consultar saldo, actualizar saldo, retirar un monto si el valor no supera el saldo actual. 

public class CuentaBancaria {
    private String nombre;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String nombre, String numeroCuenta, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void mostrarAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void actualizarSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirarMonto(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Monto retirado exitosamente");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
        public static void main(String[] args) {
            CuentaBancaria cuenta = new CuentaBancaria("Nelson De Abreu", "123456789", 5000);
    
            cuenta.mostrarAtributos();
    
            double saldo = cuenta.consultarSaldo();
            System.out.println("Saldo actual: " + saldo);
    
            cuenta.actualizarSaldo(6000);
            cuenta.mostrarAtributos();
    
            cuenta.retirarMonto(2000);
            saldo = cuenta.consultarSaldo();
            System.out.println("Saldo actualizado: " + saldo);
        }
    }
