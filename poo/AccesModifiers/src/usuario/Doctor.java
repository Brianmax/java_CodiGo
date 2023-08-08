package usuario;

public class Doctor extends User {
    String especialidad;
    static int num_doctors;
    public Doctor(String n, String c, int e, String sp){
        super(n, c, e);
        especialidad = sp;
        System.out.println("Hello from constructor");
    }
    static{
        num_doctors = 0;
        System.out.println("Hello from static");
    }
    

    public void showInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Edad: " + edad);
        System.out.println("Especialidad: " + especialidad);
    }
}
