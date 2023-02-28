public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        if(this.salary>=1000) return this.salary*0.03;
        else return 0;
    }
    double bonus(){
        if(this.workHours>40) return (this.workHours-40)*30;
        else return 0;
    }
    double raiseSalary(){
        if((2021-this.hireYear)>19) return this.salary*0.15;
        else if((2021-this.hireYear)>9 && (2021-this.hireYear)<20) return this.salary*0.10;
        else return this.salary*0.05;
    }
    void printToString()
    {
        System.out.println("Adı : "+this.name+
                "\nMaaşı : "+this.salary+
                "\nÇalışma Saati : "+this.workHours+
                "\nBaşlangıç Yılı : "+this.hireYear+
                "\nVergi : "+this.tax()+
                "\nBonus : "+this.bonus()+
                "\nMaaş Artışı : "+this.raiseSalary()+
                "\nVergi ve Bonuslar ile birlikte maaş : "+(this.salary+this.bonus()+-this.tax())+
                "\nToplam Maaş : "+(this.salary+this.raiseSalary())
        );
    }
}
