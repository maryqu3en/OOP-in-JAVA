public class Book extends Document {
    String author;
    String editor;
    
    public Book(String author, String title, String editor) {
        super(title);
        this.author = author;
        this.editor = editor;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Editor: " + editor);
    }
}