package utilidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import cards.DNI;
import users.User;


public class LecturaEscrituraFichero {
	
    public static ArrayList<User> leerUsuarios (String path) {

        File aFile = new File(path);

        ArrayList<User> listaUsuarios = new ArrayList<User>();

        try {

            FileReader fr = new FileReader(aFile);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            while (linea != null) {

                String[] usuariosLeidos = linea.split(";");
                
                int userID=Integer.parseInt(usuariosLeidos [0]);
                boolean isAdmin = false;
                       
                if( usuariosLeidos[4].toLowerCase() == "si") {
                	isAdmin = true;
                }



               User user = new User (userID, usuariosLeidos[1], usuariosLeidos[2], usuariosLeidos [3], isAdmin);
               listaUsuarios.add(user);


                linea = br.readLine();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaUsuarios;
    }
    
  
    public static void escrituraUsuarios(ArrayList<User> Usuarios, String path) {

        File aFile = new File(path);

        try {
            FileWriter fw = new FileWriter(aFile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (User u : Usuarios) {

                String escribir = u.getIdUser() + ";" + u.getNomUser() + ";" + u.getCorreo() + ";" + u.getPassword() + u.isAdmin() + "\n";

                        bw.write(escribir);

            }

            bw.flush();
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public static ArrayList<DNI> leerDnis (String path) {

        File aFile = new File(path);

        ArrayList<DNI> listaDnis = new ArrayList<DNI>();

        try {

            FileReader fr = new FileReader(aFile);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            while (linea != null) {

                String[] dnisLeidos = linea.split(";");

                Integer fecNacimiento =Integer.valueOf(dnisLeidos[4]);
                Integer fecCaducidad =Integer.valueOf(dnisLeidos[5]);
              
                DNI dni = new DNI(dnisLeidos[0], dnisLeidos[1], dnisLeidos[2],
                            dnisLeidos [3], fecNacimiento, fecCaducidad);

                listaDnis.add(dni);
                 

                linea = br.readLine();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaDnis;
    }
}


