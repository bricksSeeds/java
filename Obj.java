import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Obj {

    public static void main(String[] args) {
        new Obj();
    }

    public Obj() {

        String s = "";
        s += "v 0 0 0\n";
        s += "v 1 0 0\n";
        s += "v 0 1 0\n";
        s += "f 1// 2// 3//\n";

        System.out.println(s);

        try {
            Files.write(Paths.get("obj.obj"), s.getBytes());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }


}
