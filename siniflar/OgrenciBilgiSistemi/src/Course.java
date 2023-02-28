public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int matSozluNotu;
    double matSozluEtki;
    int fizikSozluNotu;
    double fizikSozluEtki;
    int kimyaSozluNotu;
    double kimyaSozluEtki;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.matSozluEtki=0.10;
        this.fizikSozluEtki=0.20;
        this.kimyaSozluEtki=0.40;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}