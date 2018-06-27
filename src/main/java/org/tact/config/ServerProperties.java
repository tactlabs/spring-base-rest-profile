package org.tact.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("server")
public class ServerProperties {

	private String email;
	
	private String app_web_key;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getApp_web_key() {
		return app_web_key;
	}

	public void setApp_web_key(String app_web_key) {
		this.app_web_key = app_web_key;
	}
}
