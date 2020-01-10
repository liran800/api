package com.compy.resource;

import com.compy.exception.ResourceNotFoundException;
import com.compy.model.UserList;
import com.compy.model.Users;
import com.compy.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/users")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

    @PostMapping("/")
    @CrossOrigin
    public Users createUser(@Valid @RequestBody Users user) {
        return usersRepository.save(user);

    }
    @GetMapping("/all")
    @CrossOrigin
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @GetMapping("/email/{email}")
    @CrossOrigin
    public List<Users> getUserByEmail(@PathVariable("email") final String email) {
        return usersRepository.findByEmail(email);
    }

    @GetMapping("/id/{id}")
    @CrossOrigin
    public Optional<Users> getUserById(@PathVariable("id") final Integer id) {
        return usersRepository.findById(id);
    }

    @PutMapping("/update/{id}")
    @CrossOrigin
    public  Users updateUser(@PathVariable("id") final Integer id, @Valid @RequestBody Users user)  {

        Optional<Users> users = usersRepository.findById(id);
        if (users.isPresent() && user.getId() == user.getId()) {
            return usersRepository.save(users.get());
        }
        return null;
    }

    @DeleteMapping("/id/{userId}")
    @CrossOrigin
    public ResponseEntity<?> deleteUser(@PathVariable Integer userId) {
        return usersRepository.findById(userId).map(user -> {
            usersRepository.delete(user);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("User " + userId + " not found"));
    }

  /*  @PostMapping("/id/{userId}/update/list")
    public ResponseEntity<?> updateUserList(@PathVariable Integer userId, , @Valid @RequestBody UserList userList) {
        return usersRepository.findById(userId).map(user -> {
            user.setUserLists((List<UserList>) userList);
            usersRepository.save(user);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("User " + userId + " not found"));
    }*/
}
