package com.nissint.example;

import java.io.IOException;
import java.util.logging.Logger;

import javax.websocket.CloseReason;
import javax.websocket.CloseReason.CloseCodes;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/name")
public class ExampleEndpoint {

	private static Logger logger = Logger.getLogger( ExampleEndpoint.class.getName() );
	private static Session currentSession;
	
	@OnOpen
	public void onOpen( Session session ) {
		currentSession = session;
		logger.info( "Connected ... " + session.getId() );
	}

	@OnMessage
	public String onMessage( String message, Session session ) {
		currentSession = session;
		switch (message) {
		case "quit":
			try {
				session.close( new CloseReason( CloseCodes.NORMAL_CLOSURE, "Client requested close" ) );
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			break;
		}
		return message;
	}

	public static void sendMessage( String name ) {
		if ( currentSession != null ) {
			try {
				logger.info( "Sending name: " + name );
				currentSession.getBasicRemote().sendText( name );
			} catch ( IOException e ) {
				e.printStackTrace();
			}
		} else {
			logger.warning( "currentSession is null" );
		}
	}
	
	@OnClose
	public void onClose( Session session, CloseReason closeReason ) {
		logger.info(String.format("Session %s closed because of %s", session.getId(), closeReason));
	}
}
