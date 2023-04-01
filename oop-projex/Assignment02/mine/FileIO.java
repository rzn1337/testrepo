import java.io.*;

public class FileIO {


    FileInputStream fileInq;
    ObjectInputStream inq;

    FileInputStream fileIns;
    ObjectInputStream ins;
    DrawingPanel panel;
    FileOutputStream fileOutq;
    ObjectOutputStream outq;

    FileOutputStream fileOuts;
    ObjectOutputStream outs;

    public FileIO(DrawingPanel p) throws IOException {



        fileOuts = new FileOutputStream("StackData.ser");
        outs = new ObjectOutputStream(fileOuts);

        panel = p;
    }

    public void writeQueueData() throws IOException {
        fileOutq = new FileOutputStream("QueueData.ser");
        outq = new ObjectOutputStream(fileOutq);
        for (Shape s : panel.getQueue()) {
            outq.writeObject(s);
        }
        outq.close();
        fileOutq.close();
    }

    public void writeStackData() throws IOException {
        fileOuts = new FileOutputStream("StackData.ser");
        outs = new ObjectOutputStream(fileOuts);
        for (Shape s : panel.getStack()) {
            outs.writeObject(s);
        }
        outs.close();
        fileOuts.close();
    }


    public void readQueueData() throws IOException, ClassNotFoundException {
        fileInq = new FileInputStream("QueueData.ser");
        inq = new ObjectInputStream(fileInq);
        try {
            while (true) {
                Object obj = inq.readObject();
                if (obj instanceof Shape) {
                    Shape shape = (Shape) obj;
                    panel.queue.offer(shape);
                } else {
                }
            }
        } catch (EOFException e) {
        }
        inq.close();
        fileInq.close();

        FileOutputStream fosq = new FileOutputStream("QueueData.ser");
        fosq.close();
    }


    public void readStackData() throws IOException, ClassNotFoundException {
        fileIns = new FileInputStream("StackData.ser");
        ins = new ObjectInputStream(fileIns);
        try {
            while (true) {
                Shape shape = (Shape) ins.readObject();
                panel.stack.push(shape);
            }
        } catch (EOFException e) {
        }
        ins.close();
        fileIns.close();
        FileOutputStream foss = new FileOutputStream("StackData.ser");
        foss.close();
    }

}
