public class App {
    public static void main(String[] args) throws Exception {
        singleton  object=singleton.getobject();
        thredesafe objThredesafe=thredesafe.getobject();
        System.out.println(objThredesafe.mesessge());
        System.out.println(object.mesessge());
        System.out.println(object);
    }
}
