package singleton;

public class singleton {
        private static singleton instance;
        private String name;
        private singleton()
        {
            // private constructor
            System.out.println("Prime Minister Created");
        }

        //synchronized method to control simultaneous access
        synchronized public static singleton getInstance()
        {
            if (instance == null)
            {
                instance = new singleton();
            }
            return instance;
        }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


