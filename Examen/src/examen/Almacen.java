package examen;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Almacen {
    public static void RegistroUsuario(User aa){
        try{
        ObjectOutputStream a=new ObjectOutputStream(new FileOutputStream("Usuario"));
        a.writeObject(aa);
        a.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
