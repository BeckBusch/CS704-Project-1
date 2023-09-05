import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.net.ServerSocketFactory;

public class POS {
    public static void main(String... args) throws IOException {
        ServerListener server = new ServerListener();
        server.start();
    }

    static class ServerListener extends Thread {

        private ServerSocket serverSocket;

        ServerListener() throws IOException {
            serverSocket = ServerSocketFactory.getDefault().createServerSocket(4007);
        }

        @Override
        public void run() {
            while (true) {
                try {
                    final Socket socketToClient = serverSocket.accept();
                    ClientHandler clientHandler = new ClientHandler(socketToClient);
                    clientHandler.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class ClientHandler extends Thread {
        private Socket socket;
        ObjectInputStream inputStream;

        ClientHandler(Socket socket) throws IOException {
            this.socket = socket;
            inputStream = new ObjectInputStream(socket.getInputStream());
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Object o = inputStream.readObject();
                    Obejct[] input = new Object[] {o};
                    System.out.println("Read object: " + o);
                    System.out.println(o[0]);
                } catch (IOException e) {
                    e.printStackTrace();

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
