package Singleton.zad3;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ShenaiKabilova
 */
public class Balansator {
    private static Balansator instance;
    private Set<Server> servers;

    private Balansator() {
        servers = new HashSet<>();
    }

    public static Balansator balansatorGetInstance() {
        if(instance == null) {
            return instance = new Balansator();
        }
        return instance;
    }

    public void addServer(Server server) {
        servers.add(server);
    }

    public void removerServer(Server server) {
        servers.remove(server);
    }

    public void getCurrentServers() {
        for (Server s : servers) {
            System.out.println(s.getServerName() + " " + s.getServerCurrentTime());
        }
    }
}
