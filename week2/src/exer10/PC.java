package exer10;

/**
 * @author Gyt
 * @create 2021-01-31-21:33
 */
public class PC {
    private USB[] usbs = new USB[4];


    public void add(USB usb) {
        for(int i=0;i<usbs.length;i++) {
            if(usbs[i]==null) {
                usbs[i]=usb;
                break;
            }
        }
    }

    public void powerOn() {
        for(int i=0;i<usbs.length;i++) {
            if(usbs[i]!=null) {
                usbs[i].turnOn();
            }
        }
        System.out.println("电脑开机成功");
    }

    public void powerOff() {
        for(int i=0;i<usbs.length;i++) {
            if(usbs[i]!=null) {
                usbs[i].turnOff();
            }
        }
        System.out.println("电脑关机成功");
    }

}
