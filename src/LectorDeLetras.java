public class LectorDeLetras {

    char leerLetras(char letraSinEncriptar, int clave){
        int codigoDeLetraEncriptada = letraSinEncriptar + clave;
        char letraEncriptada = (char) codigoDeLetraEncriptada;
        return letraEncriptada;
    }

    String leerPalabras(String textoSinEncriptar, int clave){
            StringBuilder creadorDePalabras = new StringBuilder();
            for (int i = 0; i < textoSinEncriptar.length(); i++ ){
                char simbolo = textoSinEncriptar.charAt(i);
                char letraEncriptada = leerLetras(simbolo, clave);
                creadorDePalabras.append(letraEncriptada);
            }
            String textoEncriptado = creadorDePalabras.toString();
            return textoEncriptado;

    }
}
