

public class Main {
    public static void main(String[] args) {

        Encriptador encriptador = new Encriptador();
        String textoEncriptado = encriptador.encriptar("hola", 98);
        System.out.println(textoEncriptado);

        Desencriptador desencriptador = new Desencriptador();
        String textoDesencriptado = desencriptador.desencriptar("ÊÑÎÃ", 98);
        System.out.println(textoDesencriptado);

        }
    }
