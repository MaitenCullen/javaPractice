public class personaClass {
    
    public static void main(String[] args){

        Cliente cliente = new Cliente();
      
        cliente.setCredito(131);
        cliente.setNombre("maxi");
        cliente.setEdad(38);
        cliente.setTelefono(1234567);
        System.out.println(cliente.getNombre() + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setSalario(4000);
        trabajador.setNombre("maxi");
        trabajador.setEdad(19);
        System.out.println(trabajador.getEdad());
        System.out.print(trabajador.getSalario());
        System.out.print(trabajador.getNombre());
    }
}


 class Persona {
     private int edad;
     private String nombre;
     private int telefono;

     public void setEdad(int edad){
        this.edad = edad;
   }
   public int getEdad(){
       return this.edad;
   }
   public void setTelefono(int telefono) {
    this.telefono = telefono; 
}
    public int getTelefono(){
        return this.telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    public String getNombre(){
        return this.nombre;
    }
    
public void metodos(){
    getTelefono();
    getNombre();
    getEdad();
}
   
}

class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito; 
    }
    public int getCredito(){
        return this.credito;
    }
    public void metodos(){
       getCredito();
    }
}

class Trabajador extends Persona {
    private int salario;
    public Trabajador(){
        super();
    }

    public void setSalario (int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
    public void metodos(){
        getSalario();
     }
}
