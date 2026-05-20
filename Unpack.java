// Unpack.java

import java.io.*;

public class Unpack {

    public static void unpack(String packedFile) throws Exception {

        FileInputStream fis = new FileInputStream(packedFile);

        // Check Magic Number
        byte[] magic = new byte[2];
        fis.read(magic);

        String str = new String(magic);

        if (!str.equals("11")) {
            System.out.println("Invalid Packed File");
            fis.close();
            return;
        }

        File dir = new File("Unpacked");

        if (!dir.exists()) {
            dir.mkdir();
        }

        byte[] header = new byte[100];

        while (fis.read(header) > 0) {

            String head = new String(header).trim();

            String[] info = head.split(" ");

            String filename = info[0];
            int filesize = Integer.parseInt(info[1]);

            byte[] data = new byte[filesize];

            fis.read(data);

            FileOutputStream fos =
                    new FileOutputStream("Unpacked/" + filename);

            fos.write(data);

            fos.close();
        }

        fis.close();

        System.out.println("Unpacking completed...");
    }

    public static void main(String[] args) throws Exception {

        unpack("PackedFile.pack");
    }
}