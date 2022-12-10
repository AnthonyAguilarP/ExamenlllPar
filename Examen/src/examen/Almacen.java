package examen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
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
    public static User IngresoUsuario(){
        try{
        ObjectInputStream a=new ObjectInputStream(new FileInputStream("Usuario"));
        return (User)a.readObject();
        }catch(Exception e){
            return null;
        }
    }
}
