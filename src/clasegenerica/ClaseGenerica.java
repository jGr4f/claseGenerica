package clasegenerica;

import java.util.Scanner;

public class ClaseGenerica {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a continuacion el numero de personas que desea registrar: ");
        int nper = Integer.parseInt(s.nextLine());
        if (nper > 0) {
            ArrayList bPersonas = new ArrayList(nper);
            for (int i = 0; i < nper; i += 1) {
                System.out.println("Digita el nombre de la persona: ");
                String anom = s.nextLine();
                
                System.out.println("Digita la edad de " + anom + ": ");
                String ed = s.nextLine();
                int eda = Integer.parseInt(ed);
                Persona per = new Persona(anom);

                Pair<Persona, Integer> pair = new Pair<>();
                pair.setPer(per);
                pair.setEd(eda);
                bPersonas.add(pair);
            }
            System.out.println("Registro terminado.\n \n ");

            System.out.println("Digita el numero del registro a consultar: ");
            int cons = s.nextInt() -1;
            System.out.println("El registro consultado es: " + bPersonas.get(cons));

        } else {
            System.out.println("Programa finalizado.");
        }

        /*datos.add(persona1);
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
   
       System.out.println(cajaCadena.GetDato().toUpperCase());*/
    }

}
