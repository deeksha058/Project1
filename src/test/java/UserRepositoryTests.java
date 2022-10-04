import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import project1.demo.Project1.Project1Application;
import project1.demo.Project1.User;
import project1.demo.Project1.UserRepository;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
@ContextConfiguration(classes= Project1Application.class)
public class UserRepositoryTests {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;


    @Test
    public void testCreateUser(){
        User user = new User();
        user.setEmail("radha34@gamil.com");
        user.setPassword("dradhees2020");
        user.setFirstName("radha");
        user.setLastName("Jinjkjdal");

        User savedUser = repo.save(user);

        User existUser = entityManager.find(User.class, savedUser.getId());

        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());

        System.out.println(savedUser);

    }
    @Test
    public void testFindUserByEmail(){

        String email = "deeksha2013092@akgec.ac.in";
        User user = repo.findByEmail(email);
        assertThat(user).isNotNull();

    }
// test methods go below
}

