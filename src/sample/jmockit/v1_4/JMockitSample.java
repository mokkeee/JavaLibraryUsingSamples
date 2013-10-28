package sample.jmockit.v1_4;

/**
 * Date: 13/10/29
 * Time: 0:33
 */
public class JMockitSample {

    private final String name;

    private Integer age;

    private String address;

    public JMockitSample(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void growOld() {
        age++;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void run() {
        JMockitSample sample = new JMockitSample(35, "mokky");
        System.out.println("Name:" + sample.getName());
        System.out.println(" age:" + sample.getAge());
        System.out.println(" age:" + sample.getAge());
        System.out.println(" age:" + sample.getAge());
    }

}
