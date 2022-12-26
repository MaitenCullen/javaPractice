public class privateClass {
    
    public static void Main (String[] args){
        Persona persona1 = new Persona();
        persona1.setNombre('pepito');
        system.out.println(persona1.getNombre(););
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(String edad) {
        this.edad = edad; 
    }
    public String getEdad(){
        return this.edad;
    }
    public String serNombre(String nombre) {
        this.nombre = nombre; 
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono; 
    }
    public String getTelefono() (){
        return this.telefono;
    }
}