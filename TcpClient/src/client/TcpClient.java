package client;

import java.io.IOException;

/**
 * Created by ejiang on 2017-07-13.
 */
public class TcpClient {
    public static void main(String[] args) {
        try {
            new TcpClientHelper();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
