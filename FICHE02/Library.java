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
}
