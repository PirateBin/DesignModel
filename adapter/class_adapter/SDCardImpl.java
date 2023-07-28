package pattern.adapter.class_adapter;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return new String("SDCard read msg : hello world SD");
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : "+msg);
    }
}
