public class Encriptador {

    LectorDeLetras lectorDeLetras = new LectorDeLetras();

    String encriptar(String textoSinEncriptar, int clave){

       String textoEncriptado = lectorDeLetras.leerPalabras(textoSinEncriptar, clave);
       return textoEncriptado;

}
}
