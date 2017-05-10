package org.java_websocket.handshake;

public class HandshakeImpl1Client extends HandshakedataImpl1 implements ClientHandshakeBuilder {
	private static final String DEFAULT_SCHEME = "ws";

	private String resourceDescriptor = "*";
	private String scheme = DEFAULT_SCHEME;

	public HandshakeImpl1Client() {
	}

	public void setResourceDescriptor( String resourceDescriptor ) throws IllegalArgumentException {
		if(resourceDescriptor==null)
			throw new IllegalArgumentException( "http resource descriptor must not be null" );
		this.resourceDescriptor = resourceDescriptor;
	}

	@Override
	public void setScheme( String scheme ) {
		this.scheme = scheme;
	}

	public String getResourceDescriptor() {
		return resourceDescriptor;
	}

	@Override
	public String getScheme() {
		return scheme;
	}
}
