package implementacionarbolb;

public class ArbolBB {

    Nodo Raiz;

    ArbolBB() {
        Raiz = null;
    }
//Metodo InsertarNodo al Arbol

    public void Insertar(int valor) {
        Nodo Nuevo = new Nodo(valor);
        if (Raiz == null) {
            Raiz = Nuevo;
        } else {
            Nodo Recorrer = Raiz;
            Nodo NuevoPadre;
            boolean BuscarLugar = true;
            while (BuscarLugar == true) {
                NuevoPadre = Recorrer;
                if (valor < Recorrer.Informacion) {
                    Recorrer = Recorrer.hijoIzquierdo;
                    if (Recorrer == null) {
                        NuevoPadre.hijoIzquierdo = Nuevo;
                        BuscarLugar = false;
                    }
                } else {
                    Recorrer = Recorrer.hijoDerecho;
                    if (Recorrer == null) {
                        NuevoPadre.hijoDerecho = Nuevo;
                        BuscarLugar = false;
                    }
                }
            }
        }
    }

    public void InOrden(Nodo Raiz) {
        if (Raiz != null) { //verifica si la raiz es diferente de null
            InOrden(Raiz.hijoIzquierdo); //invocar el metodo inorden 
            System.out.println(Raiz.Informacion + " ");
            InOrden(Raiz.hijoDerecho); // invocar el metodo inorden
        }
    }
public void PreOrden(Nodo Raiz){
     if (Raiz != null) {
            System.out.print(Raiz.Informacion + " ");
            PreOrden(Raiz.hijoIzquierdo);
            PreOrden(Raiz.hijoDerecho);
        }
    }
public void PostOrden(Nodo Raiz) {
        if (Raiz != null) {
            PostOrden(Raiz.hijoIzquierdo);
            PostOrden(Raiz.hijoDerecho);
            System.out.print(Raiz.Informacion + " ");
        }
    }

public boolean BuscarNodo(int dato){
    Nodo recorrer=Raiz;
    boolean encontrado=false;
    if (recorrer!=null) {
        //verifica si el dato a buscar esta en la raiz
        if (dato==recorrer.Informacion) {
            encontrado=true;
        }else{
            while(recorrer.Informacion!=dato){
                if (dato<recorrer.Informacion) {
                    recorrer=recorrer.hijoIzquierdo;
                }else{
                    recorrer=recorrer.hijoDerecho;
                }
                if (recorrer==null) {
                    encontrado=false;
                    break;
                }
                if (recorrer.Informacion==dato) {
                    encontrado=true;
                }
            }
        }
    }
    return encontrado;
}

public void insertarnodo(int valor) {
        if (BuscarNodo(valor) == true) {
            System.out.println("el " + valor + " ya existe en el arbol");
        } else {
           Insertar(valor);
        }
    }
}

