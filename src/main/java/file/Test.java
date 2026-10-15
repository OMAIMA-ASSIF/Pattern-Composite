package file;

import file.system.File;
import file.system.Folder;

public class Test {
    public static void main(String[] args){
        Folder root = new Folder("Root");
        root.addChild(new File("pom.xml"));
        root.addChild(new File(".git"));
        Folder src = (Folder) root.addChild(new Folder("src"));
        src.addChild(new File("README.MD"));
        Folder java=(Folder) src.addChild(new Folder("Java"));
        src.addChild(new Folder("Test"));
        java.addChild(new File("Main.java"));
        root.print();
    }
}
