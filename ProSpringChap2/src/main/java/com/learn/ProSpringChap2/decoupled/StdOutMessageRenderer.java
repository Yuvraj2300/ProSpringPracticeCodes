package com.learn.ProSpringChap2.decoupled;

public class StdOutMessageRenderer implements MessageRenderer {
	MessageProvider provider;

	public void render() {
		if (provider == null) {
			throw new RuntimeException(
					"You must set the message provider for class :" + StdOutMessageRenderer.class.getName()) {
			};
		}
		System.out.println(provider.getMessage());
	}

	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return this.provider;
	}

	public void setMessageProvider(MessageProvider provider) {
		this.provider	=	provider;
	}
}
