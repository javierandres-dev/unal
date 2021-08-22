package Challenge03;

import java.util.ArrayList;

public class Producto {

    public static ArrayList<Integer> Tipos(ArrayList<Integer> tipos) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < tipos.size(); i++) {
            int item = tipos.get(i);
            if (!res.contains(item)) {
                res.add(item);
            }
        }
        return res;
    }

    public static ArrayList<Integer> MeFaltanProductosTipo(ArrayList<Integer> productos, ArrayList<Integer> tipos, int tipo) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < productos.size(); i++) {
            int index = productos.get(i);
            int item = tipos.get(index);
            if (item == tipo) {
                res.add(index);
            }
        }
        return res;
    }

    public static ArrayList<Integer> NoTengoProductos(ArrayList<Integer> otros, ArrayList<Integer> productos) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < otros.size(); i++) {
            int item = otros.get(i);
            if (!productos.contains(item)) {
                res.add(item);
            }
        }
        return res;
    }

    public static Integer CuantosItemsCambio(ArrayList<Integer> otros, ArrayList<Integer> productos) {
        /*
        int count = 0;
        for (int i = 0; i < otros.size(); i++) {
            int item = otros.get(i);
            if (productos.contains(item)) {
                count++;
            }
        }
        return count;
         */
        int amount1 = NoTengoProductos(otros, productos).size();
        int amount2 = NoTengoProductos(productos, otros).size();
        return Math.min(amount1, amount2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> listTipos = new ArrayList<Integer>();
        listTipos.add(1);
        listTipos.add(2);
        listTipos.add(5);
        listTipos.add(5);
        listTipos.add(5);
        listTipos.add(1);
        listTipos.add(2);
        listTipos.add(5);
        listTipos.add(5);
        listTipos.add(5);
        //System.out.println(listTipos);//[1,2,5,5,5,1,2,5,5,5]

        ArrayList<Integer> listFaltan = new ArrayList<Integer>();
        listFaltan.add(1);
        listFaltan.add(3);
        listFaltan.add(6);
        listFaltan.add(8);
        //System.out.println(listFaltan);//[1,3,6,8]

        ArrayList<Integer> listOtros = new ArrayList<Integer>();
        listOtros.add(3);
        listOtros.add(5);
        listOtros.add(7);
        listOtros.add(10);
        listOtros.add(15);
        listOtros.add(16);
        //System.out.println(listOtros);//[3,5,7,10,15,16]

        ArrayList<Integer> listTengo = new ArrayList<Integer>();
        listTengo.add(4);
        listTengo.add(10);
        listTengo.add(5);
        listTengo.add(8);
        //System.out.println(listTengo);//[4,10,5,8]

        System.out.println(Tipos(listTipos));//[1,2,5]
        System.out.println(MeFaltanProductosTipo(listFaltan, listTipos, 5));//[3,8]
        System.out.println(MeFaltanProductosTipo(listFaltan, listTipos, 2));//[1,6]
        System.out.println(NoTengoProductos(listOtros, listTengo));//[3,7,15,16]
        System.out.println(CuantosItemsCambio(listOtros, listTengo));//2
    }
}
