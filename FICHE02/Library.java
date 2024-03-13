public class Library {
    Document[] docs;
    static int index = 0, n;

    public Library(int n) {
        docs = new Document[n];
        this.n = n;
    }

    public void addDocument(Document doc) {
        if (index < n) {
            docs[index] = doc;
            index++;
        } else {
            System.out.println("Library is full");
        }
    }

    public void listing() {
        for (Document document : docs) {
            if (document != null) {
                document.display();
            }
        }
    }

    public static void main(String[] args) {
        Library lib = new Library(3);
        Document doc1 = new Document("Doc1");
        Document doc2 = new Document("Doc2");
        Document doc3 = new Document("Doc3");
        Document doc4 = new Document("Doc4");
        lib.addDocument(doc1);
        lib.addDocument(doc2);
        lib.addDocument(doc3);
        lib.addDocument(doc4);
        lib.listing();
    }
}
