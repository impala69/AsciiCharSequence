package Human;

public class human {
    public static void main(String[] args) {
        Human n3=new Human();
        Human n1=new Human((byte) 24,"Mark","Lovrov","pingpong");
        Human n2=new Human((byte) 29,"Olga","Ivanova");
    }

    public static class Human {
        byte age;
        String name;
        String secondName;
        String favoriteSport;
        public Human(){}
        public Human(byte age,String name,String secondName,String favoriteSport){
            this(age,name,secondName);
            this.age=age;
            this.name=name;
            this.secondName=secondName;
            this.favoriteSport=favoriteSport;
        }
        public Human(byte age,String name,String secondName){
            this.age=age;
            this.name=name;
            this.secondName=secondName;
        }

    }

}
