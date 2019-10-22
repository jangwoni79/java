import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedStream {
    public static void main(String[] args) {
        BufferedInputStream bi = new BufferedInputStream(System.in);
        BufferedOutputStream bo = new BufferedOutputStream(System.out);
        int aa;

        try {
            while ((aa = bi.read()) != -1) {
                bo.write(aa);
            }
            bo.flush();
        } catch(IOException ie) {}
    }

}
