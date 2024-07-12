package lesson9.practice.practice4;

public class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String birthday;
    private String telephoneNumber;

    public Reader(String fullName) {
        this.fullName = fullName;
    }

    public Reader(String fullName, int libraryCardNumber, String faculty, String birthday, String telephoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.telephoneNumber = telephoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void takeBook(int number){
        System.out.println(fullName + " take " + number + " book(s)");
    }

    public void takeBook(String ... books){
        System.out.print(fullName + " take: ");
        int n = 1;
        for (String b:
                books) {
            if(n == books.length){
                System.out.println(b);
                break;
            }
            System.out.print(b + ", ");
            n++;
        }
        System.out.println();
    }

    public void takeBook(Book ... books){
        System.out.println(fullName + " take: ");
        int n = 1;
        for (Book b:
                books) {
            if(n == books.length){
                System.out.println(b.getName() + ",  " + b.getAuthor() + ".");
                break;
            }
            System.out.println(b.getName() + ",  " + b.getAuthor() + ";");
            n++;
        }

    }


}
