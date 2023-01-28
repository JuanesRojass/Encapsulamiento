public class Ejercicio {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        
        persona.setNombre("Juanes Rojas");
        persona.setEdad(21);
        persona.setTelefono(6363636);

        System.out.println("Nombre: "+ persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: "+ persona.getTelefono());
    }
}

class Persona{
    private int edad, telefono;
    private String nombre;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

}
