class Emp{
    int eid;
    String name;
    static String company = "XYZ";
    Emp(int eid, String name){
        this.eid = eid;
        this.name = name;
    }
    void display()
    {
        System.out.println("EMP ID "+eid +"\nName " +name+"\nCompany "+company);
    }
}


class StaticVar{
    public static void main(String[] a){
        Emp e1 = new Emp(1, "Jhon");
        Emp e2 = new Emp(2, "Albert");
        e1.display();
        e2.display();
    }
}
