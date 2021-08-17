package cn.tedu.di;


public class Emp {
    String name="jack";
    private Dept d;

    public Dept getD() {
        return d;
    }

    public void setD(Dept d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", d=" + d +
                '}';
    }
}
