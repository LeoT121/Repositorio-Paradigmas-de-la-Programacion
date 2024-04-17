public class Persona{
    private String nombre, apellido_materno, apellido_paterno;
    private int edad;
    private boolean sexo;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, String apellido_paterno, String apellido_materno, int edad, boolean sexo){
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setApellido_materno(String apellido_materno){
        this.apellido_materno = apellido_materno;
    }
    
    public String getApellido_materno(){
        return this.apellido_materno;
    }
    
    public void setApellido_paterno(String apellido_paterno){
        this.apellido_paterno = apellido_paterno;
    }
    
    public String getApellido_paterno(){
        return this.apellido_paterno;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setSexo(boolean sexo){
        this.sexo = sexo;
    }
    
    public boolean getSexo(){
        return this.sexo;
    }
    
}