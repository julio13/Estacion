package unitec.org.estacion;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Alfredo on 06/02/2016.
 */
public class ServivioEstacion {

   public String leerEstacion ()throws Exception{
       String mensaje = "nada todavia";
       URL  url=new URL("http://www.weatherlink.com/user/sierraguadalupe");
      URLConnection con= url.openConnection();
InputStreamReader in=new InputStreamReader(con.getInputStream());
       BufferedReader reader=new BufferedReader(in);
       int numeroLineas=0;
       while(reader.readLine()!=null){
           numeroLineas++;
           if (numeroLineas==155)mensaje=reader.readLine().toString();
       }


       //primero nos conectamos a la estacion


       return mensaje;
   }
}
