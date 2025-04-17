/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filesystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Phantom Hitman
 */
public class Folder {
    private final String name;
    private final List<Object> contents = new ArrayList<>(); // Folder or File

    public Folder(String name) {
        this.name = name;
    }

    public void addItem(Object item) {
        contents.add(item);
    }

    public int getTotalSize() {
        int total = 0;
        for (Object obj : contents) {
            switch (obj) {
                case File file -> total += file.getSize();
                case Folder folder -> total += folder.getTotalSize();
                default -> {
                }
            }
        }
        return total;
    }

    public void printContents(String prefix) {
        for (Object obj : contents) {
            switch (obj) {
                case File file -> System.out.println(prefix + "- File: " + file.getName());
                case Folder folder -> {
                    System.out.println(prefix + "+ Folder: " + folder.name);
                    folder.printContents(prefix + "  ");
                }
                default -> {
                }
            }
        }
    }
    
}
