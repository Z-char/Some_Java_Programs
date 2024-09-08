public class TVActorDriver
{
    public static void main(String[] args) {
        TVActor a = new TVActor();
        a.name = "Thomas Middleditch";
        a.role = "Richard Hendricks";
        a.age = 1;
        
        TVActor b = new TVActor();
        b.name = "Martin Starr";
        b.role = "Bertram Gilfoyle";
        b.age = 2;
        
        TVActor c = new TVActor();
        c.name = "Kumail Nanjiani";
        c.role = "Dinesh Chugtai";
        c.age = 3;
        
        System.out.println(a.name + " played " + a.role + " ," + a.age);
        System.out.println(b.name + " played " + b.role + " ," + b.age);
        System.out.println(c.name + " played " + c.role + " ," + c.age);
    }
}