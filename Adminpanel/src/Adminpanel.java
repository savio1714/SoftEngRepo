public class Adminpanel {
    private static Adminpanel instance=null;

    private  int version;

    private  Adminpanel(){
        version=2019;
    }
    public static Adminpanel getInstance(){
        if(instance == null){
            instance = new Adminpanel();
        }

        return instance;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }


}
