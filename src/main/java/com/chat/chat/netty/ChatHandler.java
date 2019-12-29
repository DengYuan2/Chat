package com.chat.chat.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.time.LocalDateTime;

/**
 * 处理消息的handler
 * TextWebSocket在netty中，是用于为webSocket专门处理文本的对象，frame是消息的载体
 */
public class ChatHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    //将所有客户端的channel保存到一个组里面,用于记录和管理所有客户端的channel
    private static ChannelGroup clients = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        //获取从客户端传来的消息
        String content = msg.text();
        System.out.println("接收到的数据为：" + content);
        //刷到所有客户端
//        for (Channel channel : clients) {
//            channel.writeAndFlush(new TextWebSocketFrame("[服务器接收到消息：]" + LocalDateTime.now()) + "接收到消息，消息为：" + content);
//        }
        //下面这行和上面的for循环一致，都可以使用
        clients.writeAndFlush(new TextWebSocketFrame("[服务器接收到消息：]" + LocalDateTime.now()) + "接收到消息，消息为：" + content);


    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {//每打开一个客户端就会调用此方法，如打开一个浏览器页面
        //当客户端连接服务端后（或者说打开连接），打开客户端的channel，并且放到ChannelGroup中去进行管理
        clients.add(ctx.channel());

    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        //当触发handlerRemoved，ChannelGroup会自动移除对应客户端的channel
        clients.remove(ctx.channel());//该句在该方法里其实是多余的，因为关闭连接后会自动移除该客户端的channel
        System.out.println("客户端断开，channel对应的长id为：" + ctx.channel().id().asLongText());
        System.out.println("客户端断开，channel对应的短id为：" + ctx.channel().id().asShortText());
    }
}
