package DoubleTH.source.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DoubleTH.source.Services.UserService;
import DoubleTH.source.model.User;

@RestController
@RequestMapping("/")
public class homeAPI {
	
	@Autowired(required = true)
	private UserService uService;
	
	@PostMapping("/Users")
	public ResponseEntity<?> postSave(@Param(value = "id") Long id, @Param(value = "username") String username){
		try {
			User us = new User();
			us.setId(id);
			us.setUsername(username);
			uService.save(us);
		} catch (Exception e) {
			ResponseEntity.ok("Error");
		}
		
		return ResponseEntity.ok("Done");
	}
	

	@GetMapping("/Users")
	public ResponseEntity<?> getAll(@Param(value = "id") Long id, @Param(value = "username") String username){
		List<User> list = uService.findAll();
		
		return ResponseEntity.ok(list);
	}
}
