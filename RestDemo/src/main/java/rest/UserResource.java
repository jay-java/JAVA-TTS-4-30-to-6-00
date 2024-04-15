package rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("users")
public class UserResource {
	
	UserDAO dao = new UserDAO();

	@GET
	@Path("allusers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUser() {
		return dao.getAllUser();
	}
	
	@GET
	@Path("getuserbyid/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserById(@PathParam("id") int id) {
		return dao.getUserById(id);
	}
	
	@POST
	@Path("adduser")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> addUser(User u){
		return dao.addUser(u);
	}
	
	@DELETE
	@Path("deleteuser/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> deleteUser(@PathParam("id") int id){
		return dao.deleteUser(id);
	}
	
	@PUT
	@Path("updateuser/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> updateUser(@PathParam("id") int id,User u){
		return dao.updateUser(id, u.getName());
	}
}
