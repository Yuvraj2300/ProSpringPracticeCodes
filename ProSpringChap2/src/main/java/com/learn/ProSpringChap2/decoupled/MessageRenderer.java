package com.learn.ProSpringChap2.decoupled;


public interface MessageRenderer {
	void	render();
	MessageProvider	getMessageProvider();
	void	setMessageProvider(MessageProvider	provider);
}
