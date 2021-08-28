/**
 * O código tem como função calcular a media de 7, 8 e 9
 * Assim como a media de 4, 5 e 6. Após isso ele irá retornar a soma das medias e por fim a media das duas medias
 */
public class Media {
    /**
     * O metodo main foi dado como responsavel pela realização dos processamentos e de imprimir os resultado
     * @param args
     */
    public static void main(String args[]) {
        int media789 = (7+8+9)/3;
        System.out.println(media789);
        int media456 = (4+5+6)/3;
        System.out.println(media456);
        int somaMedia = media456 + media789;
        System.out.println(somaMedia);
        int mediaMedia = somaMedia/2;
        System.out.println(mediaMedia);
    }
}
