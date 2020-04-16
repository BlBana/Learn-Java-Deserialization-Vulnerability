package cc.blbana.Basic;

import java.util.Properties;

public class User {
    private int age;
    private String name;
    private String sex;
    private Properties properties;
    public String address;

    public User() {
        System.out.println("Called in User()");
    }

    public int getAge() {
        System.out.println("Called in getAge()");
        return age;
    }

    public String getName() {
        System.out.println("Called in getName()");
        return name;
    }

    public String getSex() {
        System.out.println("Called in getSex()");
        return sex;
    }

    public void setSex(String sex) {
        System.out.println("Called in setSex()");
        this.sex = sex;
    }

    public Properties getProperties() {
        System.out.println("Called in getProperties()");
        return properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", properties=" + properties +
                ", address='" + address + '\'' +
                '}';
    }
}

