class Folder implements FileSystemComponent {
    private String name;
    private FileSystemComponent[] children;
    private int count = 0; // To track added elements

    public Folder(String name, int size) 
    {
        this.name = name;
        this.children = new FileSystemComponent[size]; // Fixed-size array
    }

    public void add(FileSystemComponent component) 
    {
        if (count < children.length)
         {
            children[count++] = component;
        } 
        else 
        {
            System.out.println("Folder " + name + " is full. Cannot add more files/folders.");
        }
    }

    @Override
    public void showDetails() 
    {
        System.out.println("Folder: " + name);
        for (int i = 0; i < count; i++)
         {
            children[i].showDetails();
        }
    }
}
