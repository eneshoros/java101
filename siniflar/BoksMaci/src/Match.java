public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int startOrder;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            if(this.order()==1) startOrder=1;
            else startOrder=2;
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("===Yeni Round===");
                if(startOrder==1){
                    this.f2.health=this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    this.f1.health=this.f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                }
                if(startOrder==2){
                    this.f1.health=this.f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                    this.f2.health=this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                }
                System.out.println(this.f1.name+" sağlık :"+this.f1.health);
                System.out.println(this.f2.name+" sağlık :"+this.f2.health);
            }
        }
        else System.out.println("Sporcuların sikletleri uymuyor.");


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }

    int order(){
        int rand=(int)(Math.random()*100);
        if(rand>=0 && rand<50) return 1;
        else return 2;
    }
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
