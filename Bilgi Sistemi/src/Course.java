public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    double avgnote;
    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;

    }
    public void averageCal(){
        avgnote = (note * 0.8) + (sozlu * 0.2);
    }
}
