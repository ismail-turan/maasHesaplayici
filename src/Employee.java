public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYEAR;
    double tax;
    double bonus;
    double raise;

    Employee(String name,int salary, int workHours, int hireYEAR){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYEAR=hireYEAR;
    }
    void tax(){
        if (this.salary>0 && this.salary<100){
            this.tax=this.salary*0;
        }else {
            this.tax=this.salary*(0.03);
        }
    }
    void  bonus(){
        if (this.workHours>40){
            this.bonus=(this.workHours-40)*30;
        }
    }
    void raiseSalary(){
        if (2021-this.hireYEAR<10){
            this.raise=this.salary*(0.05);
        }else if ((2021-this.hireYEAR>9) && (2021-this.hireYEAR<20)){
            this.raise=this.salary*(0.10);
        }else {
            this.raise=this.salary*(0.15);
        }
    }
    void toStringPrint(){
        System.out.println("Adı           :"+this.name);
        System.out.println("Maaşı         :"+this.salary);
        System.out.println("Çalışma saati :"+this.workHours);
        System.out.println("Başlangıç yılı:"+this.hireYEAR);
        System.out.println("Vergi         :"+this.tax);
        System.out.println("Bonus         :"+this.bonus);
        System.out.println("Maaş Artışı   :"+this.raise);
        System.out.println("Toplam Maaş   :"+(this.salary+this.bonus-this.tax));
        System.out.println("Zamlı Artış   :"+(this.salary+this.bonus-this.tax+this.raise));

    }
}
