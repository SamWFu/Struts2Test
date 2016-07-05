package action;

import org.apache.struts2.convention.annotation.*;

import dao.DaoFactory;

/**
 * @author 付施威
 * @version V1.0
 * @SystemName UTB-CLOUD
 * @ModuleName action
 * @Date 16/5/29上午11:25
 * @Description 描述
 */
/**
 * 使用注解来配置Action
 *
 */
@ParentPackage("struts-default")
// 父包
@Namespace("/")
@ExceptionMappings({
		@ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })

public class UserAction {

	private String name;
	private String loginname;
	private String pwd;

	@Action(value = "test", results = { @Result(name = "success", location = "/HelloWorld.jsp") })
	public String execute() throws Exception {

		this.name = DaoFactory.getUserDao().getUser(1).getName();
		return "success";
	}

	@Action(value = "login", results = { @Result(name = "success", location = "/HelloWorld.jsp") })
	public String login() throws Exception {

		System.out.println(loginname + pwd);
		this.name = loginname;
		return "success";
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getLoginname() {

		return loginname;
	}

	public void setLoginname(String loginname) {

		this.loginname = loginname;
	}

	public String getPwd() {

		return pwd;
	}

	public void setPwd(String pwd) {

		this.pwd = pwd;
	}
}
