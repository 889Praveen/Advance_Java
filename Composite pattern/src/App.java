public class App {
    public static void main(String[] args) {
        // Creating individual files
        FileSystemComponent file1 = new File("Document.pdf");
        FileSystemComponent file2 = new File("Photo.jpg");

        // Creating a folder with fixed size
        Folder folder1 = new Folder("MyFolder", 2);
        folder1.add(file1);
        folder1.add(file2);

        // Creating a root folder with fixed size
        Folder root = new Folder("RootFolder", 3);
        root.add(folder1);
        root.add(new File("MainFile.txt"));

        // Displaying the whole file system structure
        root.showDetails();
    }
}