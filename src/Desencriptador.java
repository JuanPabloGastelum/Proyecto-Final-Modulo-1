public class Desencriptador {

    LectorDeLetras lectorDeLetras = new LectorDeLetras();

     String desencriptar(String textoSinEncriptar, int clave){

        String textoDesencriptado = lectorDeLetras.leerPalabras(textoSinEncriptar, -clave);
        return textoDesencriptado;

    }

}
