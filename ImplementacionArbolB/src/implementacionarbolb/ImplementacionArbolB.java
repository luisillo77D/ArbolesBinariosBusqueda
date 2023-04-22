/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementacionarbolb;

/**
 *
 * @author luisi
 */
public class ImplementacionArbolB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBB miarbol = new ArbolBB();
        miarbol.Insertar(50);
        miarbol.Insertar(30);
        miarbol.Insertar(80);
        miarbol.Insertar(10);
        miarbol.Insertar(35);
        miarbol.Insertar(1);
        miarbol.Insertar(70);
        miarbol.Insertar(90);
        
        System.out.println(" \nRecorrido InOrden: ");
        miarbol.InOrden(miarbol.Raiz);
        System.out.println(" \nRecorrido PreOrden: ");
        miarbol.PreOrden(miarbol.Raiz);
        System.out.println(" \nRecorrido PostOrden: ");
        miarbol.PostOrden(miarbol.Raiz);
        System.out.println("\n"+miarbol.BuscarNodo(100));
        miarbol.insertarnodo(1);
    }
    
}
