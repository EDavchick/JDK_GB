package org.less01_server;

import org.less01_server.client.ClientGUI;
import org.less01_server.server.ServerWindow;

public class Main {
    public static void main(String[] args) {
        // создание самого сервера 1 окно
        ServerWindow serverWindow = new ServerWindow();
        // создание клиентов, чтобы они могли посылать сообщения на сервер
        // здесь по 1 окну на каждого клиента
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
    }
}
