public class Main{
    public static void main(String[] args) {
            Library lib = new Library(3);
            Document doc1 = new Document("Doc1");
            Book book1 = new Book("book1", "author1", "editor1");
            Internet inter1 = new Internet("internet1", "url.url.com");
            Document doc2 = new Document("Doc2");

            
            lib.addDocument(doc1);
            lib.addDocument(book1);
            lib.addDocument(inter1);
            lib.addDocument(doc2);
            lib.listing();

        }
}
    