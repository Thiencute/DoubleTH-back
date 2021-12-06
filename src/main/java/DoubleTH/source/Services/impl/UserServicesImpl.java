package DoubleTH.source.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DoubleTH.source.Repository.UserRepo;
import DoubleTH.source.Services.UserService;
import DoubleTH.source.model.User;

@Service
public class UserServicesImpl implements UserService{

	@Autowired
	private UserRepo repo;
	
	@Override
	public void save(User u) {
		repo.save(u);
	}

	@Override
	public List<User> findAll() {
		return repo.findAll();
	}
	
}
