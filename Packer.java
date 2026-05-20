// Packer.java

import java.io.*;
import java.nio.file.*;

public class Packer {

    public static void pack(String sourceFolder, String packedFile) throws Exception {

        FileOutputStream fos = new FileOutputStream(packedFile);

        // Magic Number
        fos.write("11".getBytes());

        Files.walk(Paths.get(sourceFolder))
                .filter(Files::isRegularFile)
                .forEach(path -> {
                    try {

                        File file = path.toFile();

                        String header = file.getName() + " " + file.length();

                        while (header.length() < 100) {
                            header += " ";
                        }

                        fos.write(header.getBytes());

                        FileInputStream fis = new FileInputStream(file);

                        byte[] buffer = new byte[1024];
                        int bytes;

                        while ((bytes = fis.read(buffer)) > 0) {
                            fos.write(buffer, 0, bytes);
                        }

                        fis.close();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });

        fos.close();

        System.out.println("Packing completed...");
    }

    public static void main(String[] args) throws Exception {

        pack("Demo", "PackedFile.pack");
    }
}