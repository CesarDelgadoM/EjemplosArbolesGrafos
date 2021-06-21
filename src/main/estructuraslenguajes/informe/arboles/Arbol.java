package main.estructuraslenguajes.informe.arboles;

public class Arbol
{
        private NodoArbol raiz;
    
        //construir un arbol vacio
         public Arbol()
        {
                raiz = null;
        }
    
        //insertar un nuevo ndo en el arbol de busqueda binaria
        public void insertarNodo(int valorInsertar)
        {
                if(raiz == null)
                {
                        raiz = new NodoArbol(valorInsertar); //crea nodo raiz
                }
                else
                {
                        raiz.insertar(valorInsertar); //llama al metodo insertar        
                }
        }
    
        // EMPIEZA EL RECORRIDO EN PREORDEN
        public void recorridoPreorden()
        {
                ayudantePreorden(raiz);
        }

        //metodo recursivo para recorrido en preorden
        private void ayudantePreorden(NodoArbol nodo)
        {
                if(nodo == null)
                {
                        return;
                }
                System.out.print(nodo.datos + " "); //mostrar datos del nodo
                ayudantePreorden(nodo.nodoizquierdo);//recorre subarbol izquierdo
                ayudantePreorden(nodo.nododerecho);//recorre subarbol derecho
        }
    
        //EMPEZAR RECORRIDO INORDEN
        public void recorridoInorden()
        {
                ayudanteInorden(raiz);
        }
    
        //meoto recursivo para recorrido inorden
        private void ayudanteInorden( NodoArbol nodo)
        {
                if(nodo == null)
                {
                        return;
                }
                ayudanteInorden(nodo.nodoizquierdo);
                System.out.print(nodo.datos + " ");
                ayudanteInorden(nodo.nododerecho);
        }
    
        //EMPEZAR RECORRIDO POSTORDEN
        public void recorridoPosorden()
        {
                ayudantePosorden(raiz);        
        }
    
        //metodo recursivo para recorrido postorden
        private void ayudantePosorden(NodoArbol nodo)
        {
                if( nodo == null )
                {
                        return;
                }
                ayudantePosorden(nodo.nodoizquierdo);
                ayudantePosorden(nodo.nododerecho);
                System.out.print(nodo.datos + " ");
        }
}
