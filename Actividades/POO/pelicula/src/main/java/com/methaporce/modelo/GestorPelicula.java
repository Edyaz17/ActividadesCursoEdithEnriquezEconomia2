package com.methaporce.modelo;
import java.util.ArrayList;
import java.util.List;

public class GestorPelicula  {
    
        public List<Pelicula> peli;
        
        //List<Pelicula> pelicula = new ArrayList<>();
        
        public GestorPelicula(List<Pelicula> pelicula){
            peli = pelicula;
        }
        
        public void agregarPelicula(Pelicula pelicula){
            peli.add(pelicula);
        }
        
        public void eliminarPelicula(int idDel){
            peli.removeIf(pelicula -> pelicula.getId() == idDel);
        }

        public List<Pelicula> obtenerPeliculas(){
            return new ArrayList<>();
        }

        public List<Pelicula> obtenerPeliculasDisponibles(){
            List<Pelicula> disponibles = new ArrayList<>();
            for (Pelicula pelicula : peli) {
                if (pelicula.isDisponible()) {
                    disponibles.add(pelicula);
                }
            }return disponibles;
        }

        public List<Pelicula> obtenerPeliculasNoDisponibles() {
            List<Pelicula> noDisponibles = new ArrayList<>();
                for (Pelicula pelicula : peli) {
                    if (!pelicula.isDisponible()) {
                        noDisponibles.add(pelicula);
                    }
                }return noDisponibles;
         }

        public void marcarPeliculaComoDisponible(int id){
            for (Pelicula pelicula : peli){
                if (pelicula.getId() == id){
                    pelicula.setDisponible(true);
                return;
                }
            }
        }

}
    
    


