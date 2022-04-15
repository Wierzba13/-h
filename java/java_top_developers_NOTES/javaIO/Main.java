package javaIO;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
/*
    Class Path - reprezentuje pliki i foldery
    Class Files - zapewnia operacje operujace na obiektach klasy path
    Class FileSystem - opisuje dostepne filesystems i ich wlasciwosci np. separator lub katalog glowny

    Files.copy(file, path);
    Files.move(toMove, whereMove);
    Files.delete(toDelete);

*/

//        Console c = System.console();
//        if(c == null) {
//            System.out.println("Not supported!");
//            return;
//        }
//        PrintWriter writer = c.writer();
//        writer.println("Supported! Welcome :D");


//        FileSystem fs = FileSystems.getDefault();
//        fs.getFileStores().forEach(s-> System.out.println(s.type()+" "+s.name()));
//        fs.getRootDirectories().forEach(p-> System.out.println(p));
//        String sep = fs.getSeparator();
//        Path exampleFile = Path.of("/", "home", "wierzba", ".bashrc");
//        Path exampleFile = Path.of("/home/wierzba/.bashrc");
//        System.out.println(exampleFile.getFileName());
//        System.out.println(Path.of("."));
//        System.out.println(Path.of(".").getParent());
//        Path secondPath = exampleFile.resolve("..");
//        System.out.println(secondPath);
//        System.out.println(exampleFile.getName(1));
//        System.out.println(exampleFile.getName(2));

//        try {
//            Files.list(Path.of("/home/wierzba/Pictures")).forEach(f-> System.out.println(f));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            Files.walk(Path.of("/run/media/wierzba/680719B628A963CF/PROGRAMMING/JAVA/scripts/")).map(p->p.toString()).filter(f->f.endsWith("java")).forEach(s-> System.out.println(s));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
            // Is directory
//            Files.walk(Path.of("/run/media/wierzba/680719B628A963CF/PROGRAMMING/")).filter(f->Files.isDirectory(f)).forEach(f-> System.out.println(f));

            // Is hidden
//            Files.walk(Path.of("/home/wierzba/")).filter(f-> {
//                try {
//                    return Files.isHidden(f);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                return false;
//            }).forEach(f-> System.out.println(f));

            // Is readable / executable
//            Files.walk(Path.of("/run/media/wierzba/680719B628A963CF/PROGRAMMING/")).filter(f->Files.isExecutable(f)).forEach(f-> System.out.println(f));
//            Files.walk(Path.of("/run/media/wierzba/680719B628A963CF/PROGRAMMING/")).filter(f->Files.isReadable(f)).forEach(f-> System.out.println(f));

//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}