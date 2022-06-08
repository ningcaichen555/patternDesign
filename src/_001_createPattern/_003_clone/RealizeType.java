package _001_createPattern._003_clone;

public class RealizeType implements Cloneable {
    public RealizeType() {
        System.out.println("构造函数创建");
    }

    private String cloneName;

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone完成");
        return super.clone();
    }
}
