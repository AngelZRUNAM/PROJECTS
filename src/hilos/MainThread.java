/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class MainThread {
    //Metodo principal del Thread principal, aqui se crea y se ejecutan tantos subMains como elementos tenga la lista urls
    void initProc(){
        //Utilizar algun metodo de entrada para recbir las cadenas
        ArrayList<String>  urls = new ArrayList<String>();
        //Para agregar a la lista se usa el metodo add()
        urls.add("Nueva URL");
        //Agregar tantas cadenas como se necesiten
        urls.add("url 2");
        urls.add("url 3");
        
        //Iteramos en los elementos de la lista obteniendo la url
        for (int i = 0; i < urls.size(); i++) {
            String url = urls.get(i);
            //Instanciamos un objeto de la clase subThread y le enviamos como parametro la url
            SubThread nuevoHilo = new SubThread(url);
            //Con el metodo start le decimos al hilo que se inicie a ejecutar
            nuevoHilo.start();
        }
    }
    
}
