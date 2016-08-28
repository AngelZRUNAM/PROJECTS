/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author 
 */
public class SubThread extends Thread{

    private final String url;

    //Constructor de la clase, asigna el parametro de entrada al atributo url
    SubThread(String url) {
        this.url = url;
    }
    
    //Agregamos el metodo que se va a correr cuando se inicie el hilo
    @Override
    public void run(){
        //Utilizando el atributo url se hace el proceso de coneccion, lectura y descarga de la pagina
        //Esto lo pueden encontrar de forma sencilla aqui : http://chuwiki.chuidiang.org/index.php?title=Descargar_ficheros_web_con_Java
        //Suerte
    }
    
    
}
