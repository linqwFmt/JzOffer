//                  /+++=))    ((=+++\
//             /++++++++//      \\+++++++++\
 /*
                           _ooOoo_
                          o8888888o
                          88" . "88
                          (| -_- |)
                          O\  =  /O
                       ____/`---'\____
                     .'  \\|     |//  `.
                    /  \\|||  :  |||//  \
                   /  _||||| -:- |||||-  \
                   |   | \\\  -  /// |   |
                   | \_|  ''\---/''  |   |
                   \  .-\__  `-`  ___/-. /
                 ___`. .'  /--.--\  `. . __
              ."" '<  `.___\_<|>_/___.'  >'"".
             | | :  `- \`.;`\ _ /`;.`/ - ` : | |
             \  \ `-.   \_ __\ /__ _/   .-` /  /
        ======`-.____`-.___\_____/___.-`____.-'======
                           `=---='
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                 佛祖保佑       永无BUG
        */

/**
 * Created by "林其望".
 * DATE: 2016:10:20:20:38
 * email:1105896230@qq.com
 */
public class HelloWorld {
    public static void main(String[] args) {
        int anInt =63;
        String s = Integer.toHexString(anInt);
        byte[] bytes=new byte[6];
        for (int i=0;i<5;i++){
            bytes[i]=1;
        }
        byte[] bytes1 = s.getBytes();
        byte c=   (byte)anInt;
    }

}
