package serializableDemo.dto;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.assertj.core.api.Assertions.assertThat;

class UserDTOTest {
    @Test
    void should_get_file_info_success_when_user_has_serializable() throws IOException, ClassNotFoundException {
        generateByteStream();
        FileInputStream fis = new FileInputStream("temp.txt");

        ObjectInputStream oin = new ObjectInputStream(fis);

        UserDTO user = (UserDTO) oin.readObject();

        assertThat(user.getAge()).isEqualTo(18);
        assertThat(user.getName()).isEqualTo("张三");
        assertThat(user.getGender()).isEqualTo("male");
    }

    void generateByteStream() throws IOException {
        FileOutputStream fos = new FileOutputStream("temp.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        UserDTO user = UserDTO.builder().age(18).name("张三").gender("male").build();
        oos.writeObject(user);

        oos.flush();
        oos.close();
    }
}
