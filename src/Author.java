public class Author {
    private String authorName;
    private String authorPenName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPenName() {
        return authorPenName;
    }

    public void setAuthorPenName(String authorPenName) {
        this.authorPenName = authorPenName;
    }
    public void displayAuthorDetails(){
        System.out.println("authorName = " + authorName);
        System.out.println("authorPenName = " + authorPenName);
    }
}
