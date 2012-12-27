package com.jinsoft.shoppingcart.web.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@ResultPath(value="/")
@Result(name="success", location="pages/login.jsp")
public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 920776802666048721L;

}
