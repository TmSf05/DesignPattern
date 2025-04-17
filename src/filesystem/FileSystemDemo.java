/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filesystem;

/**
 *
 * @author Phantom Hitman
 */
public class FileSystemDemo {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder docs = new Folder("documents");
        File resume = new File("resume.pdf", 120);
        File report = new File("report.docx", 315);
        File demo = new File ("demo.ppt",205);
        File data = new File ("data.xlsx",280); 
        
        docs.addItem(data);
        docs.addItem(demo);
        docs.addItem(resume);
        docs.addItem(report);
        root.addItem(docs);
        root.addItem(new File("notes.txt", 80));
        
        System.out.println("\n===============[ FILE SYSTEM ]====================\n");
        System.out.println("Folder Structure:");
        root.printContents("");
        System.out.println("Total size: " + root.getTotalSize() + "KB");
        System.out.println("\n==================================================\n");
        
    }
}
