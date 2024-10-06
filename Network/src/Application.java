/*
* File: App.java
* Author: Orosz Olivér Arnold
* Copyright: 2024, Orosz Olivér Arnold
* Group: Szoft II/I/N
* Date: 2024-10-06
* Github: https://github.com/Hiradura/
* Licenc: GNU GPL
*/
public class Application {
    public static void main(String[] args) throws Exception {
        ConnectionManager manager = new ConnectionManager();
        manager.establishConnection("Network");
        manager.terminateConnection();
    }
}