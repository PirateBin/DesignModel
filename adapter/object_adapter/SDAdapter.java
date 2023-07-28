package pattern.adapter.object_adapter;

public class SDAdapter implements SDCard{

    //声明适配者类
    private TFCard tfCard;

    public SDAdapter(TFCard tfCard){
        this.tfCard=tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard .writeTF(msg);
    }
}
