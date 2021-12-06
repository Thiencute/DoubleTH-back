package DoubleTH.source.Services;

import java.util.List;

import DoubleTH.source.model.User;

public interface UserService {
	void save(User u);
	List<User> findAll();
}
