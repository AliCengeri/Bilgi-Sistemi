public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "101", "MAT");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course biyo = new Course("Biyoloji", "101", "BIO");

        Teacher t1 = new Teacher("Osman Cengeri", "123", "MAT");
        Teacher t2 = new Teacher("Ali Usta", "456", "FZK");
        Teacher t3 = new Teacher("Veli Bayram", "789", "BIO");

        Student s1 = new Student("Ali Cengeri", 4, "2008", mat, fizik, biyo);
        s1.addBulkExamNote(50, 30, 80, 20, 50, 70);

        Student s2 = new Student("Rıfat Yılmaz", 3, "1905", mat, fizik, biyo);
        s2.addBulkExamNote(90, 70, 30, 70, 60, 50);

        Student s3 = new Student("Hacer Eğilmez", 2, "1971", mat, fizik, biyo);
        s3.addBulkExamNote(20, 40, 90, 80, 50, 30);
    }
}