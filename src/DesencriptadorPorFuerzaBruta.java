public class DesencriptadorPorFuerzaBruta {

    Desencriptador desencriptador = new Desencriptador();

    String desencriptarPorFuerzaBruta(String textoEncriptado){
        String textoPosiblementeDesencriptado = null;

        for(int i = 1; i <= 100; i++){

            textoPosiblementeDesencriptado = desencriptador.desencriptar(textoEncriptado, i);
            boolean contienePalabraEnEspanol = contieneAlgunaPalabraEnEspanol(textoPosiblementeDesencriptado);
            if(contienePalabraEnEspanol){
                System.out.println("La clave es" + i);
                System.out.println("Y el texto desencriptado es:" + textoPosiblementeDesencriptado);
            }

        }
            return textoPosiblementeDesencriptado;


    }

    boolean contieneAlgunaPalabraEnEspanol(String texto){
        String[] palabrasEnespanol = new String[7];
        palabrasEnespanol[0] = " de ";
        palabrasEnespanol[1] = " la ";
        palabrasEnespanol[2] = " en ";
        palabrasEnespanol[3] = " es ";
        palabrasEnespanol[4] = " el ";
        palabrasEnespanol[5] = " por ";
        palabrasEnespanol[6] = " para ";
        palabrasEnespanol[7] = " un ";

        for(int i = 0; i < palabrasEnespanol.length; i++){

            if(texto.toLowerCase().contains(palabrasEnespanol[i])){
                return true;
            }

        }
        return false;

    }




}
