package DoubleTH.source.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DoubleTH.source.Services.UserService;
import DoubleTH.source.model.User;

@RestController
@RequestMapping("/")
public class homeAPI {
	
	private UserService u;
	
	@GetMapping("/")
	public ResponseEntity<?> home(){
		
		Map<String, Object> result = new HashMap<>();
	
		
		return ResponseEntity.ok(result);
	}
}
