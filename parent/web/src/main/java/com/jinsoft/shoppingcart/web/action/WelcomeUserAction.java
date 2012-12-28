package com.jinsoft.shoppingcart.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@ResultPath(value="/")
public class WelcomeUserAction extends ActionSupport {

	private static final long serialVersionUID = -3048006367675812785L;

	@Override
	//@Action(value="Welcome", results={@Result(name="success", location="pages/welcome_user.jsp")})
	@Action(value="Welcome", results={@Result(name="success", location="/welcome_user.tiles", type="tiles")})
	public String execute() {
		return SUCCESS;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String username;
}
