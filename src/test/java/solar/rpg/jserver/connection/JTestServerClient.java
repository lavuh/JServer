package solar.rpg.jserver.connection;

import org.jetbrains.annotations.NotNull;
import solar.rpg.jserver.connection.handlers.packet.JServerClient;
import solar.rpg.jserver.packet.JServerPacket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

public class JTestServerClient extends JServerClient {

    public JTestServerClient(int port, @NotNull ExecutorService executor, @NotNull Logger logger) throws IOException {
        super(InetAddress.getLocalHost(), port, executor, logger);
    }

    @Override
    public void onNewConnection(@NotNull InetSocketAddress originAddress) {

    }

    @Override
    public void onBeforeClosed() {
    }

    @Override
    public void onSocketClosed(@NotNull InetSocketAddress originAddress) {
    }

    @Override
    public void onPacketReceived(@NotNull InetSocketAddress originAddress, @NotNull JServerPacket packet) {
        //TODO: Custom packets
    }
}
