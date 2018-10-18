package cl.clubhipico.clubhipico_jaraneda;

import java.util.Scanner;

import cl.clubhipico.clubhipico_jaraneda.controller.CarreraController;
import cl.clubhipico.clubhipico_jaraneda.object.CarreraObject;

public class ClubHipicoDataBaseMain {
	
	public static void main(String[] args) {
		
		/*PARA RECIBIR DESDE TECLADO*/
		Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
		CarreraController carreraController = new CarreraController(); //controlador con logica
		
		/*Pedimos los parametros de entrada de la carrera*/
		System.out.println ("CLUB HIPICO");
		System.out.println ("===========");
        System.out.print ("Nombre carrera: " );

        String nombreCarrera = entradaEscaner.nextLine ();;

        /*Instanciamos el objeto con los datos obtenidos desde el teclado*/
        CarreraObject carrera = new CarreraObject();
        carrera.setNombre(nombreCarrera);

        /*Usamos el controlador*/
        //accion de insertar
        carreraController.insert(carrera);
        
        if (carreraController==null ^ carrera==null) {
        	
        }
        
        System.out.println("Carrera recibida "+carrera);
        
		
        for (int i = 0; i<10; i++) {
        
        }
        
        
       
        
        
		
	}

}
