
package clasegenerica;


public class ClaseGenerica {

   
    public static void main(String[] args) {
        
       ArrayList datos = new ArrayList(4);
       Manzana manzana1 = new Manzana();
       Persona persona1 = new Persona("nestor");
       
       
       datos.add(persona1);
       datos.add("Carlos");
       datos.add(45);
       datos.add(manzana1);
       
       
       
       String Nombre = (String)datos.get(1);
       Manzana Fruta = (Manzana)datos.get(3);
       System.out.println("El nombre es "+ Nombre+" Y la Fruta es " + Fruta);
       System.out.println("///");
       System.out.println("///");
       System.out.println("///");
       System.out.println("///");
              
       String nombre1 = Integer.toString((Integer)datos.get(2));
       
       System.out.println("Los nombre de la colección son " + datos.get(2));       
       
       
       
       caja<String> cajaCadena = new caja<String>();
       caja<Manzana> cajaManzanas = new caja<Manzana>();
        System.out.println("comparacion " + cajaCadena.equals(cajaManzanas));
       
        
        
        
       Manzana fruta1 = new Manzana();
       String palabra = "test";
       cajaCadena.SetDato(palabra);
       cajaManzanas.SetDato(fruta1);
       cajaManzanas.GetDato().despacho();
       
       System.out.println("El texto de la caja es" + cajaCadena.GetDato());
   
       System.out.println(cajaCadena.GetDato().toUpperCase());
       
       
        
    }
    
}
