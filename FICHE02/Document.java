public class Document {
    String title;
    static int count = 0;
    
    public Document(String title) {
        this.title = title;
        count++;
    }

    public Document(){
        count++;
    }

    public void display() {
        System.out.println("Title: " + title);
    }

}