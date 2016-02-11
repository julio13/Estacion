package unitec.org.estacion;

/**
 * Created by Alfredo on 06/02/2016.
 */
public class Estacion {

    String temperaturaMaxima;
    String temperaturaMinima;
    String temperaturaActual;
    String intencidadViento;
    String radiacionUV;
    String humedad;

    public String getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(String temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public String getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(String temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public String getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(String temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public String getIntencidadViento() {
        return intencidadViento;
    }

    public void setIntencidadViento(String intencidadViento) {
        this.intencidadViento = intencidadViento;
    }

    public String getRadiacionUV() {
        return radiacionUV;
    }

    public void setRadiacionUV(String radiacionUV) {
        this.radiacionUV = radiacionUV;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }
}
