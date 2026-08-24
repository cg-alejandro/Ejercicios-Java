public abstract class animales{
    String nombre;
    int edad;
    public animales ( String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }public abstract void hacerSonido ();
     public void mostrarDatos(){
          System.out.println("es un "+ nombre + " y tiene " + edad +" años");
    }
}