public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course biyo;
    double average;
    boolean isPass;
    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course biyo) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.fizik = fizik;
        this.biyo = biyo;
        this.mat = mat;

    }

    public void addBulkExamNote(int mat, int fizik, int biyo, int smat, int sfizik, int sbiyo) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
            this.mat.sozlu = smat;
            this.mat.averageCal();
            System.out.println("Matematik Notunuz: " + this.mat.avgnote);
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
            this.fizik.sozlu = sfizik;
            this.fizik.averageCal();
            System.out.println("Fizik Notunuz: " + this.fizik.avgnote);
        }
        if (biyo >= 0 && biyo <= 100) {
            this.biyo.note = biyo;
            this.biyo.sozlu = sbiyo;
            this.biyo.averageCal();
            System.out.println("Biyoloji Notunuz: " + this.biyo.avgnote);
        }
        this.average = average();
    }

    private double average() {
        double sonuc = (this.mat.avgnote + this.fizik.avgnote +this.biyo.avgnote) / 3;
        if (sonuc >= 50) {
            System.out.println("Sınıfı geçtiniz.");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }
        System.out.println("Ortalamanız: " + sonuc);
        System.out.println("==========");

        return sonuc;
    }
}