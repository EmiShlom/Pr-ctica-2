import java.util.Scanner; //Se importa la clase Scanner,
// usada para registrar la variable ingresada por el usuario

public class PROGRAMA_1 {
    public static void main(String[] args) {
        int horas_trabajador, extra; //variables
        double pago;
        final int sueldoxHora = 200;    //sueldo fijo


        Scanner sc = new Scanner(System.in); // Crear el objeto Scanner para leer la entrada
        System.out.printf("Ingrese las horas trabajadas: ");
        horas_trabajador = sc.nextInt(); // Guardar el valor ingresado por el usuario en una variable
    //Es necesario en Java poner esto, no como en C

        if (horas_trabajador <= 40){
            pago = horas_trabajador * sueldoxHora;
        }
        else{
            extra = horas_trabajador - 40;
            pago = (extra*1.5*sueldoxHora) + (sueldoxHora * 40);
        }

        System.out.printf("El sueldo es: " + pago);
        }
}
