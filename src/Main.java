

public class Main {
    public static void main(String[] args) {

        Encriptador encriptador = new Encriptador();
        String textoEncriptado = encriptador.encriptar("hola", 1);
        System.out.println(textoEncriptado);

        Desencriptador desencriptador = new Desencriptador();
        String textoDesencriptado = desencriptador.desencriptar("ipmb", 1);
        System.out.println(textoDesencriptado);

        }
    }
