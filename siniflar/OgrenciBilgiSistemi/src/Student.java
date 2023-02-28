public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya,int matSozlu,int fizikSozlu,int kimyaSozlu) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
            this.mat.matSozluNotu=matSozlu;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
            this.fizik.fizikSozluNotu=fizikSozlu;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
            this.kimya.kimyaSozluNotu=kimyaSozlu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note*0.80)+(this.fizik.fizikSozluNotu*this.fizik.fizikSozluEtki))+
                ((this.mat.note*0.90)+(this.mat.matSozluNotu*this.mat.matSozluEtki))+
                ((this.kimya.note*0.60)+(this.kimya.kimyaSozluNotu*this.kimya.kimyaSozluEtki)))/3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}
