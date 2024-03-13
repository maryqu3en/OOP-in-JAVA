public class Internet extends Document {
    String url;
    
    public Internet(String title, String url) {
        super(title);
        this.url = url;
    }
    
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("URL: " + url);
    }
}