package org.busystem.action;

import java.util.List;
import java.util.Map;
import org.busystem.model.User;
import org.busystem.service.IUserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private User user;
	private IUserService userService;
	private String password;
	private String pwd1;
	private int userid;
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public IUserService getUserService() {
		return userService;
	}
	
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPwd1() {
		return pwd1;
	}

	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}

	public String register() throws Exception {
		
		Map session=(Map) ActionContext.getContext().getSession();
		User user1=new User();
		user1.setUsername(user.getUsername());
		user1.setPassword(user.getPassword());
		user1.setAge(user.getAge());
		user1.setSex(user.getSex());
		user1.setRole(user.getRole());
		if(userService.addOrUpdateUser(user1))
			return SUCCESS;	
		else
		{		
			return ERROR;
		}
	}

	public String checkUser()throws Exception
	{
		Map session=(Map) ActionContext.getContext().getSession();
		User user1=userService.checkUser(user);
		if(user1!=null)	
		{session.put("user",user1);
		return SUCCESS;	}
		else
		{
			session.put("role",user.getRole());
			return ERROR;
		}
	}
	
	public String logOut()throws Exception
	{
		Map session=(Map) ActionContext.getContext().getSession();
		
		session.remove("user");
		return SUCCESS;		
	}
	
	public String updateUserPassword()throws Exception
	{
		Map session=(Map) ActionContext.getContext().getSession();
		User user1=(User) session.get("user");
		if(user1.getPassword().equals(pwd1)){
		user1.setPassword(password);
		userService.addOrUpdateUser(user1);
		session.remove("user");
		return SUCCESS;		}
		else
		{
			Map request=(Map) ActionContext.getContext().get("request");
			request.put("msg","æ…√‹¬Î¥ÌŒÛ");
					return ERROR;}
	}
	
	public String updateUserDetail()throws Exception
	{
		Map session=(Map) ActionContext.getContext().getSession();
		User user1=(User) session.get("user");
		user1.setUsername(user.getUsername());
		user1.setSex(user.getSex());
		user1.setAge(user.getAge());
		//user1.setUserdetail(userDetail1);
		if(userService.addOrUpdateUser(user1))
		{
			session.put("user",user1);
            return SUCCESS;		
        }
		else{		
		return ERROR;}
	}
	
	public String browseUser() throws Exception{

		List users=userService.getAllUsers();
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("users",users);
		return SUCCESS;
	}
	
	public String displayOneUser()throws Exception
	{
		
		User modifyUser=userService.getUserById(userid);
		System.out.println("modify");
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("user",modifyUser);
		return SUCCESS;
		
	}
	public String deleteOneUser()throws Exception
	{
		userService.deleteUserById(userid);
		System.out.println("delete");
		return SUCCESS;
		
	}
	
	public String addOrUpdateUserDetail()throws Exception
	{
		Map session=(Map) ActionContext.getContext().getSession();
		List list=userService.getAllUsers();
		User user1=(User)list.get(0);
		int currentUserId=user1.getUserid()+1;
  	    User user2=new User();
  	    user2.setUsername(user.getUsername());
  	    user2.setPassword(user.getPassword());
  	    user2.setSex(user.getSex());
  	    user2.setAge(user.getAge());
  	    user2.setRole(user.getRole());
  	    user2.setUserid(user.getUserid());
  	    if (userService.addOrUpdateUser(user2))

			return SUCCESS;
		else 
			return ERROR;			
		
	}
}
