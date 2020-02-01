public class Form {
    private volatile static Form instanceOfSingleton = null;
    public static Form getInstance() {
        if (getInstanceOfSingleton() == null) {
            setInstanceOfSingleton(new Form());
        }
        return getInstanceOfSingleton();
    }

    /**
     * @return the instanceOfSingleton
     */
    public static Form getInstanceOfSingleton() {
        return instanceOfSingleton;
    }

    /**
     * @param aInstanceOfSingleton the instanceOfSingleton to set
     */
    public static void setInstanceOfSingleton(Form aInstanceOfSingleton) {
        instanceOfSingleton = aInstanceOfSingleton;
    }
    private String name,family,job;
    private int age;
    public int getage() {
        return age;
    }
    public void setI(int i) {
        this.age = i;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the family
     */
    public String getFamily() {
        return family;
    }

    /**
     * @param family the family to set
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }

}
