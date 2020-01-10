package com.compy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@EnableJpaAuditing
public class SBApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SBApplication.class, args);
    }

    //@Override
    //@Transactional
    public void run(String... strings) throws Exception {
        // save a couple of categories
      /*  final User user = new User();
        user.setEmail("aaaa");

        Set<UserList> userLists = new HashSet<>();
        userLists.add(new UserList("Book A1", "a", user));
        userLists.add(new UserList("Book A12", "a", user));
        user.setUserLists(userLists);




        userRepository.save(user);

        // fetch all categories
        for (UserList userList : userListRepository.findAll()) {
            System.out.println(userList.toString());
        }*/
    }
}
