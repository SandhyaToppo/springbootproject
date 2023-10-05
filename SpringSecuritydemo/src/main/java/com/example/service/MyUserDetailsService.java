package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired

	UserRepository userLoginRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userLoginRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new UserPricipal(user);
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub

		return userLoginRepository.save(user);
	}

	public User getByUsername() {
		// TODO Auto-generated method stub
		return userLoginRepository.findByUsername(null);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userLoginRepository.findAll();
	}

	public User updateUser(User user) {
		// TODO Auto-generated method stub

		Optional<User> optional = userLoginRepository.findById((int) user.getUid());

		if (optional.isPresent()) {
			User _user = userLoginRepository.findById(user.getUid()).get();
			_user.setUsername(user.getUsername());
			_user.setPassword(user.getPassword());
			_user.setRoles(user.getRoles());

			return userLoginRepository.save(_user);
		}
		return null;
		// return optional.get();
	}

}
