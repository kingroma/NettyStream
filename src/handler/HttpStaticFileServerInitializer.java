package handler;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import util.CustomHttpServerCodec;

public class HttpStaticFileServerInitializer extends ChannelInitializer<SocketChannel> {

    public HttpStaticFileServerInitializer() {
    }

    @Override
    public void initChannel(SocketChannel ch) {
        ChannelPipeline pipeline = ch.pipeline();
		pipeline.addLast(new CustomHttpServerCodec());
		pipeline.addLast(new HttpStaticFileServerHandler2());
    }
}