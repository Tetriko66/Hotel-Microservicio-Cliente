//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         String     Modelo = "Galaxy A55";
         int        bateria = 18 ;
         boolean    ahorro = false;
         String     Propietario = "Sin propietario";

     System.out.println("=== TELÉFONO ===");
        System.out.println("Modelo: " + Modelo);
        System.out.println("Batería: " + bateria + "%");
        System.out.println("Estado: " + obtenerEstadoBateria(bateria));
        System.out.println("Ahorro de energía: " + ahorro);
        System.out.println("Nombre del propietario" + (Propietario != null ? Propietario : "Sin Propietario"));
    }
    public static String obtenerEstadoBateria(int bateria) {
        if  (bateria < 20) {
            return "Bateria baja";
        }
        else if (bateria > 20 && bateria <= 79 ) {
            return "Bateria suficiente";
        }
        else
        return "Bateria Alta";
    }
}