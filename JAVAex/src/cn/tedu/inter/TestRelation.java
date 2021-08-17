package cn.tedu.inter;

public class TestRelation {
}
interface Inter1{
    void save();
    void delete();
}
interface Inter2{
    void find();
    void update();
}
interface Inter3 extends Inter1,Inter2{

}
class Inter3Impl implements Inter1,Inter2{

    @Override
    public void save() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void find() {

    }

    @Override
    public void update() {

    }
}